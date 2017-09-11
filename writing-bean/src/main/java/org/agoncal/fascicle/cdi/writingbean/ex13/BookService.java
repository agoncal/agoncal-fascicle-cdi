package org.agoncal.fascicle.cdi.writingbean.ex13;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocsnippet[]
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
// end::adocsnippet[]
