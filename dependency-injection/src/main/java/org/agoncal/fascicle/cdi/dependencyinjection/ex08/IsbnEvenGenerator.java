package org.agoncal.fascicle.cdi.dependencyinjection.ex08;


import java.util.Random;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@ThirteenDigits
@Even
public class IsbnEvenGenerator implements NumberGenerator {

  // ======================================
  // =          Business methods          =
  // ======================================

  public String generateNumber() {
    return "132-84356-" + Math.abs(new Random().nextInt());
  }
}
