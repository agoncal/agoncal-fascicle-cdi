package org.agoncal.fascicle.cdi.firstlook;

// tag::adocSnippet[]
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

// end::adocSnippet[]

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@ApplicationScoped
public class BookService {

  @Inject
  IsbnGenerator numberGenerator;

  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    return book;
  }
}
// end::adocSnippet[]
