package org.agoncal.fascicle.cdi.writingbean.ex11;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
public class JDBCConnectionProducer {

  @Produces
  private Connection createConnection() {
    Connection conn = null;
    try {
      Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
      conn = DriverManager.getConnection("jdbc:derby:memory:cdiDB;create=true", "APP", "APP");

    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }

  private void closeConnection(@Disposes Connection conn) throws SQLException {
    conn.close();
  }
}
// end::adocSnippet[]
