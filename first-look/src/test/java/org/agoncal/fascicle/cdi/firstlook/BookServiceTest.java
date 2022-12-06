package org.agoncal.fascicle.cdi.firstlook;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
public class BookServiceTest {

  @Inject
  BookService bookService;

  @Test
  public void shouldCheckNumberIsThirteenDigits() {
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    assertTrue(book.getIsbn().startsWith("13"));
  }
}
