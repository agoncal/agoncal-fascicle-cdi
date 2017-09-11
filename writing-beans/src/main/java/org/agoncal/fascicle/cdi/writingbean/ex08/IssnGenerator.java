package org.agoncal.fascicle.cdi.writingbean.ex08;

import java.util.Random;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@EightDigits
@Odd
public class IssnGenerator implements NumberGenerator {

  // ======================================
  // =          Business methods          =
  // ======================================

  public String generateNumber() {
    return "8-" + Math.abs(new Random().nextInt());
  }
}
