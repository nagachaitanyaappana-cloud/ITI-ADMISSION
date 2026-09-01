package com.server.backend.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MeritListController}.
 */
@Generated
public class MeritListController__BeanDefinitions {
  /**
   * Get the bean definition for 'meritListController'.
   */
  public static BeanDefinition getMeritListControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MeritListController.class);
    InstanceSupplier<MeritListController> instanceSupplier = InstanceSupplier.using(MeritListController::new);
    instanceSupplier = instanceSupplier.andThen(MeritListController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
