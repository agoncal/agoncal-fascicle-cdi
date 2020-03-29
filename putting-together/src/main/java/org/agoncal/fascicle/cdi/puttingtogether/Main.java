package org.agoncal.fascicle.cdi.puttingtogether;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
public class Main {

  public static void main(String[] args) {

    SeContainerInitializer containerInit = SeContainerInitializer.newInstance();
    SeContainer container = containerInit.initialize();

    BookService bookService = container.select(BookService.class).get();

    Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");

    System.out.println(book);

    container.close();
  }
}
// end::adocSnippet[]
