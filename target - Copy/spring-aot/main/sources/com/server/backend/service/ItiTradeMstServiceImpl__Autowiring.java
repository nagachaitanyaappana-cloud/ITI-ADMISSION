package com.server.backend.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ItiTradeMstServiceImpl}.
 */
@Generated
public class ItiTradeMstServiceImpl__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ItiTradeMstServiceImpl apply(RegisteredBean registeredBean,
      ItiTradeMstServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("repository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
