package org.agoncal.fascicle.cdi.dependencyinjection.qualifiersmembers;


import java.util.Random;

import static org.agoncal.fascicle.cdi.dependencyinjection.qualifiersmembers.NumberOfDigits.Digits.THIRTEEN;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@NumberOfDigits(value = THIRTEEN, odd = false)
public class IsbnEvenGenerator implements NumberGenerator {

  // ======================================
  // =          Business methods          =
  // ======================================

  public String generateNumber() {
    return "132-84356-" + Math.abs(new Random().nextInt());
  }
}
