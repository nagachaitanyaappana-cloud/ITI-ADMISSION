package org.springframework.boot.tomcat.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TomcatServerProperties}.
 */
@Generated
public class TomcatServerProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'tomcatServerProperties'.
   */
  public static BeanDefinition getTomcatServerPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TomcatServerProperties.class);
    beanDefinition.setInstanceSupplier(TomcatServerProperties::new);
    return beanDefinition;
  }
}
