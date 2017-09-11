package org.agoncal.fascicle.cdi.decorators.ex01;


import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocsnippet[]
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
// end::adocsnippet[]
