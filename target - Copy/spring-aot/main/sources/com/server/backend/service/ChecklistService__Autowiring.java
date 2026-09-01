package com.server.backend.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ChecklistService}.
 */
@Generated
public class ChecklistService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ChecklistService apply(RegisteredBean registeredBean, ChecklistService instance) {
    AutowiredFieldValueResolver.forRequiredField("checklistRepository").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
