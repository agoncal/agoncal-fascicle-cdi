package org.agoncal.fascicle.cdi.events.ex01;

import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
// tag::adocSnippet[]
public class BookService {

  @Inject
  private NumberGenerator numberGenerator;

  @Inject
  private Event<Book> bookAddedEvent;

  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    bookAddedEvent.fire(book);
    return book;
  }
}
// end::adocSnippet[]
