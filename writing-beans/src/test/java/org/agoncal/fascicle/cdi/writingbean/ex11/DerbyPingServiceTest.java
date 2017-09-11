package org.agoncal.fascicle.cdi.writingbean.ex11;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class DerbyPingServiceTest {

  // ======================================
  // =             Attributes             =
  // ======================================

  protected static SeContainerInitializer containerInit;
  protected static SeContainer container;

  // ======================================
  // =          Lifecycle Methods         =
  // ======================================

  @BeforeClass
  public static void init() {
    containerInit = SeContainerInitializer.newInstance();
    container = containerInit.initialize();
  }

  @AfterClass
  public static void close() {
    container.close();
  }

  // ======================================
  // =              Methods               =
  // ======================================

  @Test
  public void shouldPingDatabase() throws Exception {
    Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
    Connection conn = DriverManager.getConnection("jdbc:derby:memory:chapter02DB;create=true", "APP2", "APP");
    conn.createStatement().executeQuery("SELECT 1 FROM SYSIBM.SYSDUMMY1");
    conn.close();
  }

  @Test
  public void shouldPingDatabaseWithDispose() throws Exception {
    DerbyPingService pingService = container.select(DerbyPingService.class).get();
    pingService.ping();
  }
}
