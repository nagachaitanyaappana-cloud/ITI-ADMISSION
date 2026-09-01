package org.springframework.boot.http.converter.autoconfigure;

import java.lang.SuppressWarnings;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link Jackson2HttpMessageConvertersConfiguration}.
 */
@Generated
public class Jackson2HttpMessageConvertersConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jackson2HttpMessageConvertersConfiguration'.
   */
  @SuppressWarnings("removal")
  public static BeanDefinition getJacksonHttpMessageConvertersConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Jackson2HttpMessageConvertersConfiguration.class);
    beanDefinition.setInstanceSupplier(Jackson2HttpMessageConvertersConfiguration::new);
    return beanDefinition;
  }
}
