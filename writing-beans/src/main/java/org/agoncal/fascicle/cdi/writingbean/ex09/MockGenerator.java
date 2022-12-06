package org.agoncal.fascicle.cdi.writingbean.ex09;


import jakarta.enterprise.inject.Alternative;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@Alternative
public class MockGenerator implements NumberGenerator {

  public String generateNumber() {
    return "MOCK";
  }
}
// end::adocSnippet[]
