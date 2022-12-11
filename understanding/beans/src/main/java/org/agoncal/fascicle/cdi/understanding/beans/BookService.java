package org.agoncal.fascicle.cdi.understanding.beans;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.inject.Vetoed;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import java.util.Date;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@Vetoed
// tag::adocSnippet[]
public class BookService {

  @Inject
  private NumberGenerator numberGenerator;
  @Inject
  private EntityManager em;

  private Date instanciationDate;

  @PostConstruct
  private void initDate() {
    instanciationDate = new Date();
  }

  @Transactional
  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    book.setInstanciationDate(instanciationDate);
    em.persist(book);
    return book;
  }
}
// end::adocSnippet[]
