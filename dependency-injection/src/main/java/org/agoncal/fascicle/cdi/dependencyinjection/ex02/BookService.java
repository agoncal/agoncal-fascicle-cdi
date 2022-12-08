package org.agoncal.fascicle.cdi.dependencyinjection.ex02;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
public class BookService {

  private NumberGenerator numberGenerator;

  public BookService() {
    this.numberGenerator = new IsbnGenerator();
  }

  public Book createBook(String title, Float price, String description) {
    Book book = new Book(title, price, description);
    book.setIsbn(numberGenerator.generateNumber());
    return book;
  }
}
// end::adocSnippet[]
