package org.springframework.boot.jdbc.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JdbcProperties}.
 */
@Generated
public class JdbcProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'jdbcProperties'.
   */
  public static BeanDefinition getJdbcPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JdbcProperties.class);
    beanDefinition.setInstanceSupplier(JdbcProperties::new);
    return beanDefinition;
  }
}
