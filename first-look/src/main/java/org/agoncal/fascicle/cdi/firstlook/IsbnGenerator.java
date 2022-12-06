package org.agoncal.fascicle.cdi.firstlook;

// tag::adocSnippet[]
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Random;

// tag::adocSnippet[]

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
@ApplicationScoped
public class IsbnGenerator {

  public String generateNumber() {
    return "13-84356-" + Math.abs(new Random().nextInt());
  }
}
// end::adocSnippet[]
