package com.server.backend;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BackendApplication}.
 */
@Generated
public class BackendApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'backendApplication'.
   */
  public static BeanDefinition getBackendApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BackendApplication.class);
    beanDefinition.setInstanceSupplier(BackendApplication::new);
    return beanDefinition;
  }
}
