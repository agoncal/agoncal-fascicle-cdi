package org.agoncal.fascicle.cdi.dependencyinjection.ex08;


import java.util.Random;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
@ThirteenDigits
@Odd
public class IsbnOddGenerator implements NumberGenerator {

  // ======================================
  // =          Business methods          =
  // ======================================

  public String generateNumber() {
    return "131-84356-" + Math.abs(new Random().nextInt());
  }
}
