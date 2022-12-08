package org.agoncal.fascicle.cdi.dependencyinjection.injectionpoint;

import org.jboss.weld.junit5.WeldJunit5Extension;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@ExtendWith(WeldJunit5Extension.class)
public class DigitalBookServiceTest {

  @Inject
  DigitalBookService bookService;

  // ======================================
  // =              Methods               =
  // ======================================

  @Test
  public void shouldCheckNumberIsThirteenDigits() {
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    assertTrue(book.getIsbn().startsWith("13"));
  }
}
