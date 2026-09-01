package com.server.backend.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ItiServiceImpl}.
 */
@Generated
public class ItiServiceImpl__BeanDefinitions {
  /**
   * Get the bean definition for 'itiServiceImpl'.
   */
  public static BeanDefinition getItiServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ItiServiceImpl.class);
    InstanceSupplier<ItiServiceImpl> instanceSupplier = InstanceSupplier.using(ItiServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(ItiServiceImpl__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
