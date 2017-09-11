package org.agoncal.fascicle.cdi.puttingtogether;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocsnippet[]
@Interceptor
@Loggable
public class LoggingInterceptor {

  @Inject
  private Logger logger;

  @AroundInvoke
  public Object logMethod(InvocationContext ic) throws Exception {
    logger.entering(ic.getTarget().getClass().getName(), ic.getMethod().getName());
    try {
      return ic.proceed();
    } finally {
      logger.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
    }
  }
}
// end::adocsnippet[]