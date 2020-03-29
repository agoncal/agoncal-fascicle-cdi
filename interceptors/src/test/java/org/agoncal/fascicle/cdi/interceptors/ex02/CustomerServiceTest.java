package org.agoncal.fascicle.cdi.interceptors.ex02;

import org.agoncal.fascicle.cdi.interceptors.Customer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class CustomerServiceTest {

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
  public void shouldSeeInterceptor() throws Exception {
    CustomerService customerService = container.select(CustomerService.class).get();
    customerService.createCustomer(new Customer());
  }
}
