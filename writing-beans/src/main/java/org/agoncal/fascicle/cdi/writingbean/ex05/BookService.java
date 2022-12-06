package org.agoncal.fascicle.cdi.writingbean.ex05;

import jakarta.enterprise.inject.Default;
import jakarta.inject.Inject;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class BookService {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  @Default
  private NumberGenerator numberGenerator;

  // ======================================
  // =          Business methods          =
  // ======================================

  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    return book;
  }
}
