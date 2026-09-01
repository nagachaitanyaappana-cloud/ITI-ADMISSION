package org.springframework.boot.servlet.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * Bean definitions for {@link HttpEncodingAutoConfiguration}.
 */
@Generated
public class HttpEncodingAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'httpEncodingAutoConfiguration'.
   */
  public static BeanDefinition getHttpEncodingAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(HttpEncodingAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(HttpEncodingAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'characterEncodingFilter'.
   */
  private static BeanInstanceSupplier<CharacterEncodingFilter> getCharacterEncodingFilterInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<CharacterEncodingFilter>forFactoryMethod(HttpEncodingAutoConfiguration.class, "characterEncodingFilter", ServletEncodingProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.servlet.autoconfigure.HttpEncodingAutoConfiguration", HttpEncodingAutoConfiguration.class).characterEncodingFilter(args.get(0)));
  }

  /**
   * Get the bean definition for 'characterEncodingFilter'.
   */
  public static BeanDefinition getCharacterEncodingFilterBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(CharacterEncodingFilter.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.servlet.autoconfigure.HttpEncodingAutoConfiguration");
    beanDefinition.setInstanceSupplier(getCharacterEncodingFilterInstanceSupplier());
    return beanDefinition;
  }
}
