package org.agoncal.fascicle.cdi.puttingtogether;


import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Inject;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {

  @Inject
  private Logger logger;

  @Loggable
  public String generateNumber() {
    logger.info("Generates Mock");
    return "MOCK";
  }
}
// end::adocSnippet[]
