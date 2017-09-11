package org.agoncal.fascicle.cdi.puttingtogether;


import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocsnippet[]
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
// end::adocsnippet[]
