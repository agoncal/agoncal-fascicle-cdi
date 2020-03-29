package org.agoncal.fascicle.cdi.interceptors.ex03;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;
import java.util.logging.Logger;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// tag::adocSnippet[]
public class ProfileInterceptor {

  @Inject
  private Logger logger;

  @PostConstruct
  public void logMethod(InvocationContext ic) throws Exception {
    logger.fine(ic.getTarget().toString());
    try {
      ic.proceed();
    } finally {
      logger.fine(ic.getTarget().toString());
    }
  }

  @AroundInvoke
  public Object profile(InvocationContext ic) throws Exception {
    long initTime = System.currentTimeMillis();
    try {
      return ic.proceed();
    } finally {
      long diffTime = System.currentTimeMillis() - initTime;
      logger.fine(ic.getMethod() + " took " + diffTime + " millis");
    }
  }
}
// end::adocSnippet[]
