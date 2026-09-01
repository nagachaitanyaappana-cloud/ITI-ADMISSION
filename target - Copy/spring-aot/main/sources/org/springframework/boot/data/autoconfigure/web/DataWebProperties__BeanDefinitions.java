package org.springframework.boot.data.autoconfigure.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DataWebProperties}.
 */
@Generated
public class DataWebProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'dataWebProperties'.
   */
  public static BeanDefinition getDataWebPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataWebProperties.class);
    beanDefinition.setInstanceSupplier(DataWebProperties::new);
    return beanDefinition;
  }
}
