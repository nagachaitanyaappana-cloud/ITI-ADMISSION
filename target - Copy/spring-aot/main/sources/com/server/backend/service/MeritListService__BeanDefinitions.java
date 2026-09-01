package com.server.backend.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MeritListService}.
 */
@Generated
public class MeritListService__BeanDefinitions {
  /**
   * Get the bean definition for 'meritListService'.
   */
  public static BeanDefinition getMeritListServiceBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MeritListService.class);
    InstanceSupplier<MeritListService> instanceSupplier = InstanceSupplier.using(MeritListService::new);
    instanceSupplier = instanceSupplier.andThen(MeritListService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
