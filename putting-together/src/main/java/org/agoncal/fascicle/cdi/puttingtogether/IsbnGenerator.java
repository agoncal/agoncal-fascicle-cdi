package org.agoncal.fascicle.cdi.puttingtogether;

import jakarta.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

  @Inject
  private Logger logger;

  @Loggable
  public String generateNumber() {
    String isbn = "13-84356-" + Math.abs(new Random().nextInt());
    logger.info("Generated ISBN : " + isbn);
    return isbn;
  }
}
// end::adocSnippet[]
