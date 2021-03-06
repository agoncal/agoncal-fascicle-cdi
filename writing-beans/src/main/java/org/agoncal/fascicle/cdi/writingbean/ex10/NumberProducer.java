package org.agoncal.fascicle.cdi.writingbean.ex10;

import javax.enterprise.inject.Produces;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
public class NumberProducer {

  @Produces
  @ThirteenDigits
  private String prefix13digits = "13-";

  @Produces
  @ThirteenDigits
  private int editorNumber = 84356;

  @Produces
  @Random
  public double random() {
    return Math.abs(new java.util.Random().nextInt());
  }
}
// end::adocSnippet[]
