/**
 * Domain classes used to produce the JSON and XML output for the RESTful services. 
 * <p>
 * These classes contain the JAXB annotations.
 *
 * @since 1.0
 * @author jwhite
 * @version 1.1
 */
package com.example;
/**
 * Description.
 *
 * @tag1
 * @tag2
 */

public class Greeter {
/**
 * Description.
 *
 * @Greeter class
 * @tag2
 */

  public Greeter() {
  /**
 * Description.
 *
 * @Greeter constructeur
 * @tag2
 */
  }
/** {@inheritDoc} */
  public final String greet(final String someone) {
    /**
 * Description.
 *
 * @greet methode
 * @someone string
 */
    return String.format("Hello babacar, %s!", someone);
  }
}
