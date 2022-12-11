package org.agoncal.fascicle.cdi.expressionlanguage;

import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

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

//  @Test
//  public void shouldCheckNumberIsThirteenDigits() {
//    BookService bookService = container.select(BookService.class).get();
//    Book book = bookService.createBook();
////    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
//    System.out.println("########### " + book.getIsbn());
//    assertTrue(book.getIsbn().startsWith("13"));
//  }
}
