package org.agoncal.fascicle.cdi.writingbean.ex03;

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
    BookService bookService = new BookService(new IsbnGenerator());
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    assertTrue(book.getIsbn().startsWith("13"));
  }

  @Test
  public void shouldCheckNumberIsEightDigits() {
    BookService bookService = new BookService(new IssnGenerator());
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    assertTrue(book.getIsbn().startsWith("8"));
  }
}
