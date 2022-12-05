package org.agoncal.fascicle.cdi.writingbean.ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class NumberGeneratorTest {

  // ======================================
  // =              Methods               =
  // ======================================

  @Test
  public void shouldCheckNumberIsThirteenDigits() {

    BookService bookService = new BookService();

    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");

    assertTrue(book.getIsbn().startsWith("13"));
  }
}
