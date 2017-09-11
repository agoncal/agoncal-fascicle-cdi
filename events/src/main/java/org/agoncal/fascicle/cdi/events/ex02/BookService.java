package org.agoncal.fascicle.cdi.events.ex02;

import javax.enterprise.event.Event;
import javax.inject.Inject;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
// tag::adocsnippet[]
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
// end::adocsnippet[]
