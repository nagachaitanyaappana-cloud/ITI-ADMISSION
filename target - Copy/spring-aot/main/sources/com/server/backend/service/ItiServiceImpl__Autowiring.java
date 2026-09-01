package com.server.backend.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ItiServiceImpl}.
 */
@Generated
public class ItiServiceImpl__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ItiServiceImpl apply(RegisteredBean registeredBean, ItiServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("repository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
