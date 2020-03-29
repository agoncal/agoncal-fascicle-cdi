package org.agoncal.fascicle.cdi.puttingtogether;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@EightDigits
public class IssnGenerator implements NumberGenerator {

  @Inject
  private Logger logger;

  @Loggable
  public String generateNumber() {
    String issn = "8-" + Math.abs(new Random().nextInt());
    logger.info("Generated ISBN : " + issn);
    return issn;
  }
}
// end::adocSnippet[]
