package org.agoncal.fascicle.cdi.interceptors.ex02;

import javax.inject.Inject;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
public class LoggingInterceptor {

  @Inject
  private Logger logger;

  @AroundConstruct
  private void init(InvocationContext ic) throws Exception {
    logger.fine("Entering constructor");
    try {
      ic.proceed();
    } finally {
      logger.fine("Exiting constructor");
    }
  }

  @AroundInvoke
  public Object logMethod(InvocationContext ic) throws Exception {
    logger.entering(ic.getTarget().toString(), ic.getMethod().getName());
    try {
      return ic.proceed();
    } finally {
      logger.exiting(ic.getTarget().toString(), ic.getMethod().getName());
    }
  }
}
// end::adocSnippet[]
