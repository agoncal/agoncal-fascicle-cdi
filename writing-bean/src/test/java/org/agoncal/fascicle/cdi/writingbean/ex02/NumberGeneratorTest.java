package org.agoncal.fascicle.cdi.writingbean.ex02;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
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
