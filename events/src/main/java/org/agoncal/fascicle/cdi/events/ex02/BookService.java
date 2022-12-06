package org.agoncal.fascicle.cdi.events.ex02;

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

  @Inject @Added
  private Event<Book> bookAddedEvent;

  @Inject @Removed
  private Event<Book> bookRemovedEvent;

  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    bookAddedEvent.fire(book);
    return book;
  }

  public void deleteBook(Book book) {
    bookRemovedEvent.fire(book);
  }
}
// end::adocSnippet[]
