package org.agoncal.fascicle.cdi.events.ex02;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
// tag::adocsnippet[]
public class InventoryService {

  @Inject
  private Logger logger;
  List<Book> inventory = new ArrayList<>();

  public void addBook(@Observes @Added Book book) {
    logger.warning("Adding book " + book.getTitle() + " to inventory");
    inventory.add(book);
  }

  public void removeBook(@Observes @Removed Book book) {
    logger.warning("Removing book " + book.getTitle() + " to inventory");
    inventory.remove(book);
  }
}
// end::adocsnippet[]
