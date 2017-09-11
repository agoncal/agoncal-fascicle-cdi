package org.agoncal.fascicle.cdi.writingbean.ex03;


import java.util.Random;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
public class IsbnGenerator implements NumberGenerator {

  // ======================================
  // =          Business methods          =
  // ======================================

  public String generateNumber() {
    return "13-84356-" + Math.abs(new Random().nextInt());
  }
}
