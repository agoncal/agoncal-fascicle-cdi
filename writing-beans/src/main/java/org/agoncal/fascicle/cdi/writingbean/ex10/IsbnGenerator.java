package org.agoncal.fascicle.cdi.writingbean.ex10;


import jakarta.inject.Inject;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

  @Inject
  @ThirteenDigits
  private String prefix;

  @Inject
  @ThirteenDigits
  private int editorNumber;

  @Inject
  @Random
  private double postfix;

  public String generateNumber() {
    return prefix + editorNumber + postfix;
  }
}
// end::adocSnippet[]
