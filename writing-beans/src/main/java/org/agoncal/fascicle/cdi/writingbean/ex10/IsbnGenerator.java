package org.agoncal.fascicle.cdi.writingbean.ex10;


import javax.inject.Inject;

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
  String prefix;

  @Inject
  @ThirteenDigits
  int editorNumber;

  @Inject
  @Random
  double postfix;

  public String generateNumber() {
    return prefix + editorNumber + postfix;
  }
}
// end::adocSnippet[]
