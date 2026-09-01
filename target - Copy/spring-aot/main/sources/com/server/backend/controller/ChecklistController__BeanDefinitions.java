package com.server.backend.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ChecklistController}.
 */
@Generated
public class ChecklistController__BeanDefinitions {
  /**
   * Get the bean definition for 'checklistController'.
   */
  public static BeanDefinition getChecklistControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ChecklistController.class);
    InstanceSupplier<ChecklistController> instanceSupplier = InstanceSupplier.using(ChecklistController::new);
    instanceSupplier = instanceSupplier.andThen(ChecklistController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
