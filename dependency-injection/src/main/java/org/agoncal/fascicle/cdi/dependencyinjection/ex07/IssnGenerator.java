package org.agoncal.fascicle.cdi.dependencyinjection.ex07;

import java.util.Random;

import static org.agoncal.fascicle.cdi.dependencyinjection.ex07.NumberOfDigits.Digits.EIGHT;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@NumberOfDigits(value = EIGHT, odd = true)
public class IssnGenerator implements NumberGenerator {

  // ======================================
  // =          Business methods          =
  // ======================================

  public String generateNumber() {
    return "8-" + Math.abs(new Random().nextInt());
  }
}
