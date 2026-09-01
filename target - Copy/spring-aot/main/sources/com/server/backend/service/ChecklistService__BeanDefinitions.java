package com.server.backend.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ChecklistService}.
 */
@Generated
public class ChecklistService__BeanDefinitions {
  /**
   * Get the bean definition for 'checklistService'.
   */
  public static BeanDefinition getChecklistServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ChecklistService.class);
    InstanceSupplier<ChecklistService> instanceSupplier = InstanceSupplier.using(ChecklistService::new);
    instanceSupplier = instanceSupplier.andThen(ChecklistService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
