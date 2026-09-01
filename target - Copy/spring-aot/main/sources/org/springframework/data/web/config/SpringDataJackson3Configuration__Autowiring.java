package org.springframework.data.web.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SpringDataJackson3Configuration}.
 */
@Generated
public class SpringDataJackson3Configuration__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SpringDataJackson3Configuration apply(RegisteredBean registeredBean,
      SpringDataJackson3Configuration instance) {
    instance.settings = AutowiredFieldValueResolver.forField("settings").resolve(registeredBean);
    return instance;
  }
}
