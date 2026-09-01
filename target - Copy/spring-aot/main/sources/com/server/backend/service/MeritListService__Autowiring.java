package com.server.backend.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MeritListService}.
 */
@Generated
public class MeritListService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MeritListService apply(RegisteredBean registeredBean, MeritListService instance) {
    AutowiredFieldValueResolver.forRequiredField("meritListRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
