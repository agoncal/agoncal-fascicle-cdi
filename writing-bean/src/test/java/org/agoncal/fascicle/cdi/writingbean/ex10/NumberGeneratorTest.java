package org.agoncal.fascicle.cdi.writingbean.ex10;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import static org.junit.Assert.assertTrue;

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
  public void shouldCheckNumberIsThirteenDigits() {
    BookService bookService = container.select(BookService.class).get();
    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
    System.out.println("########### " + book.getIsbn());
    assertTrue(book.getIsbn().startsWith("13"));
  }
}
