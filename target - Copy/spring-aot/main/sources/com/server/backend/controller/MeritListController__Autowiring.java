package com.server.backend.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MeritListController}.
 */
@Generated
public class MeritListController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MeritListController apply(RegisteredBean registeredBean,
      MeritListController instance) {
    AutowiredFieldValueResolver.forRequiredField("meritListService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
