package org.agoncal.fascicle.cdi.decorators.ex01;


import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@Decorator
public class FromEightToThirteenDigitsDecorator implements NumberGenerator {

  @Inject
  @Delegate
  private NumberGenerator numberGenerator;

  public String generateNumber() {
    String issn = numberGenerator.generateNumber();
    String isbn = "13-84356" + issn.substring(1);
    return isbn;
  }
}
// end::adocSnippet[]
