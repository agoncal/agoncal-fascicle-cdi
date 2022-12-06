package org.agoncal.fascicle.cdi.events.ex02;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
// tag::adocSnippet[]
public class InventoryService {

  @Inject
  private Logger logger;
  List<Book> inventory = new ArrayList<>();

  public void addBook(@Observes @Added Book book) {
    logger.info("Adding book " + book.getTitle() + " to inventory");
    inventory.add(book);
  }

  public void removeBook(@Observes @Removed Book book) {
    logger.info("Removing book " + book.getTitle() + " to inventory");
    inventory.remove(book);
  }
}
// end::adocSnippet[]
