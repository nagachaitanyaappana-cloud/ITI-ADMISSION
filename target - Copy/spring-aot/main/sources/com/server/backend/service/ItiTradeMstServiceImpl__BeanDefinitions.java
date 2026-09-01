package com.server.backend.service;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ItiTradeMstServiceImpl}.
 */
@Generated
public class ItiTradeMstServiceImpl__BeanDefinitions {
  /**
   * Get the bean definition for 'itiTradeMstServiceImpl'.
   */
  public static BeanDefinition getItiTradeMstServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ItiTradeMstServiceImpl.class);
    InstanceSupplier<ItiTradeMstServiceImpl> instanceSupplier = InstanceSupplier.using(ItiTradeMstServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(ItiTradeMstServiceImpl__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
