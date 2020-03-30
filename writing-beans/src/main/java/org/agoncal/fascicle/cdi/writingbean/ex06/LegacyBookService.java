package org.agoncal.fascicle.cdi.writingbean.ex06;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@ApplicationScoped
public class LegacyBookService {

  @Inject
  @EightDigits
  NumberGenerator numberGenerator;

  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    return book;
  }
}
// end::adocSnippet[]
