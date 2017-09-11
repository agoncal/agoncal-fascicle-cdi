package org.agoncal.fascicle.cdi.writingbean;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 *         http://www.antoniogoncalves.org
 *         --
 */
// tag::adocsnippet[]
public class LoggingProducer {

  @Produces
  private Logger createLogger(InjectionPoint injectionPoint) {
    return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
  }
}
// end::adocsnippet[]
