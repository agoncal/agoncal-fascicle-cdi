package org.agoncal.fascicle.cdi.writingbean.ex11;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@ApplicationScoped
public class DerbyPingService {

  @Inject
  private Connection conn;

  public void ping() throws SQLException {
    conn.createStatement().executeQuery("SELECT 1 FROM SYSIBM.SYSDUMMY1");
  }
}
// end::adocSnippet[]
