package org.agoncal.fascicle.cdi.writingbean.ex11;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

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

  @BeforeAll
  public static void init() {
    containerInit = SeContainerInitializer.newInstance();
    container = containerInit.initialize();
  }

  @AfterAll
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
