package org.agoncal.fascicle.cdi.firststep;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
public class BookService {

  @Inject
  private IsbnGenerator numberGenerator;

  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    return book;
  }
}
// end::adocSnippet[]
