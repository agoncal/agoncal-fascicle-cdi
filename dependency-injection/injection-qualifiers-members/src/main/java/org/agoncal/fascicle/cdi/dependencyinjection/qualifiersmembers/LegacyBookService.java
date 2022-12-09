package org.agoncal.fascicle.cdi.dependencyinjection.qualifiersmembers;

import jakarta.inject.Inject;

import static org.agoncal.fascicle.cdi.dependencyinjection.qualifiersmembers.NumberOfDigits.Digits.EIGHT;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class LegacyBookService {

  // ======================================
  // =             Attributes             =
  // ======================================

  @Inject
  @NumberOfDigits(value = EIGHT, odd = true)
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
