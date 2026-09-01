package org.springframework.boot.hibernate.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HibernateProperties}.
 */
@Generated
public class HibernateProperties__BeanDefinitions {
  /**
   * Get the bean definition for 'hibernateProperties'.
   */
  public static BeanDefinition getHibernatePropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HibernateProperties.class);
    beanDefinition.setInstanceSupplier(HibernateProperties::new);
    return beanDefinition;
  }
}
