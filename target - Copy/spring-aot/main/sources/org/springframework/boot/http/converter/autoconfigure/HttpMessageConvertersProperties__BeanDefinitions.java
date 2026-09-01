package org.springframework.boot.http.converter.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HttpMessageConvertersProperties}.
 */
@Generated
public class HttpMessageConvertersProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'httpMessageConvertersProperties'.
   */
  public static BeanDefinition getHttpMessageConvertersPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpMessageConvertersProperties.class);
    beanDefinition.setInstanceSupplier(HttpMessageConvertersProperties::new);
    return beanDefinition;
  }
}
