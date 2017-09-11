package org.agoncal.fascicle.cdi.writingbean.ex08;

import javax.inject.Inject;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class BookEvenService {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  @ThirteenDigits
  @Even
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
