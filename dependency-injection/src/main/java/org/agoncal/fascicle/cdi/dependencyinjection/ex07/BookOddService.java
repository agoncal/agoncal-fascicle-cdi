package org.agoncal.fascicle.cdi.dependencyinjection.ex07;

import jakarta.inject.Inject;

import static org.agoncal.fascicle.cdi.dependencyinjection.ex07.NumberOfDigits.Digits.THIRTEEN;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class BookOddService {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  @NumberOfDigits(value = THIRTEEN, odd = true)
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
