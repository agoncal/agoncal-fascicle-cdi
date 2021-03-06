package org.agoncal.fascicle.cdi.writingbean.ex07;

import javax.inject.Inject;

import static org.agoncal.fascicle.cdi.writingbean.ex07.NumberOfDigits.Digits.THIRTEEN;

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
  @NumberOfDigits(value = THIRTEEN, odd = false)
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
