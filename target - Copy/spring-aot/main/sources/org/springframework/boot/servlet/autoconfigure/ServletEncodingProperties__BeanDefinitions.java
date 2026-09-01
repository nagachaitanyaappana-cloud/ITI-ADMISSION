package org.springframework.boot.servlet.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ServletEncodingProperties}.
 */
@Generated
public class ServletEncodingProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'servletEncodingProperties'.
   */
  public static BeanDefinition getServletEncodingPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletEncodingProperties.class);
    beanDefinition.setInstanceSupplier(ServletEncodingProperties::new);
    return beanDefinition;
  }
}
