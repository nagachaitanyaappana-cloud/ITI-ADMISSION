package com.server.backend.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ChecklistController}.
 */
@Generated
public class ChecklistController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ChecklistController apply(RegisteredBean registeredBean,
      ChecklistController instance) {
    AutowiredFieldValueResolver.forRequiredField("checklistService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
