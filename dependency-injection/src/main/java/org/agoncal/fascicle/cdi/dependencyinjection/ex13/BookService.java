package org.agoncal.fascicle.cdi.dependencyinjection.ex13;

import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@Named
public class BookService {

  private String title, description;
  private Float price;
  private Book book;

  @Inject
  @ThirteenDigits
  private NumberGenerator numberGenerator;

  public String createBook() {
    book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    return "customer.xhtml";
  }
}
// end::adocSnippet[]
