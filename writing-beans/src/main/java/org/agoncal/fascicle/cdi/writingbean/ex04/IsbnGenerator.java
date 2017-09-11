package org.agoncal.fascicle.cdi.writingbean.ex04;


import java.util.Random;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocsnippet[]
public class IsbnGenerator implements NumberGenerator {

  public String generateNumber() {
    return "13-84356-" + Math.abs(new Random().nextInt());
  }
}
// end::adocsnippet[]
