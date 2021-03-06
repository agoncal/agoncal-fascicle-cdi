package org.agoncal.fascicle.cdi.writingbean.ex08;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class NumberGeneratorTest {

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
  public void shouldCheckNumberIsThirteenDigitsOdd() {
    BookOddService bookService = container.select(BookOddService.class).get();
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    assertTrue(book.getIsbn().startsWith("131"));
  }

  @Test
  public void shouldCheckNumberIsThirteenDigitsEven() {
    BookEvenService bookService = container.select(BookEvenService.class).get();
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    assertTrue(book.getIsbn().startsWith("132"));
  }

  @Test
  public void shouldCheckNumberIsEightDigits() {
    LegacyBookService bookService = container.select(LegacyBookService.class).get();
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    assertTrue(book.getIsbn().startsWith("8"));
  }
}
