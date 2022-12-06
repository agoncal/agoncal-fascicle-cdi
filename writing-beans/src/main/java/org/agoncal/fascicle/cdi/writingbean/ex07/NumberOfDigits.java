package org.agoncal.fascicle.cdi.writingbean.ex07;

import jakarta.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Antonio Goncalves
 * http://www.antoniogoncalves.org
 * --
 */
// @formatter:off
// tag::adocSnippet[]
@Qualifier
@Retention(RUNTIME)
@Target({FIELD, TYPE, METHOD})
public @interface NumberOfDigits {

  Digits value();
  boolean odd();

  enum Digits {
    TWO, EIGHT, TEN, THIRTEEN
  }
}
// end::adocSnippet[]
// @formatter:on
