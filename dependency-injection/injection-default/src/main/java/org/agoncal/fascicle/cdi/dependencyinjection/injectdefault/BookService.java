package org.agoncal.fascicle.cdi.dependencyinjection.injectdefault;

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

  // tag::adocSnippet[]
  @Inject
  private NumberGenerator numberGenerator;
  // end::adocSnippet[]

  // ======================================
  // =          Business methods          =
  // ======================================

  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    return book;
  }
}
