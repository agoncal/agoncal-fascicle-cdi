package org.agoncal.fascicle.cdi.puttingtogether;

import org.jboss.weld.environment.se.Weld;
import org.junit.Test;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import static org.junit.Assert.assertTrue;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocsnippet[]
public class BookServiceTest {

  @Test
  public void shouldCheckNumberIsMock() {

    // tag::adocskip[]
    // with 2.2 weld treats the two beans.xml files a two separate archives. To have test alternative override that
    // we need to switch off this feature
    System.setProperty(Weld.ARCHIVE_ISOLATION_SYSTEM_PROPERTY, "false");

    // end::adocskip[]
    SeContainerInitializer containerInit = SeContainerInitializer.newInstance();
    SeContainer container = containerInit.initialize();

    BookService bookService = container.select(BookService.class).get();

    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");

    assertTrue(book.getNumber().startsWith("MOCK"));

    container.close();
  }
}
// end::adocsnippet[]
