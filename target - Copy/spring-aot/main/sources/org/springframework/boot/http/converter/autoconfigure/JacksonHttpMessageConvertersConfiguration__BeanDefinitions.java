package org.springframework.boot.http.converter.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import tools.jackson.databind.json.JsonMapper;

/**
 * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration}.
 */
@Generated
public class JacksonHttpMessageConvertersConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'jacksonHttpMessageConvertersConfiguration'.
   */
  public static BeanDefinition getJacksonHttpMessageConvertersConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.class);
    beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration::new);
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration}.
   */
  @Generated
  public static class JacksonJsonHttpMessageConverterConfiguration {
    /**
     * Get the bean definition for 'jacksonJsonHttpMessageConverterConfiguration'.
     */
    public static BeanDefinition getJacksonJsonHttpMessageConverterConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration.class);
      beanDefinition.setInstanceSupplier(JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'jacksonJsonHttpMessageConvertersCustomizer'.
     */
    private static BeanInstanceSupplier<JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConvertersCustomizer> getJacksonJsonHttpMessageConvertersCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConvertersCustomizer>forFactoryMethod(JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration.class, "jacksonJsonHttpMessageConvertersCustomizer", JsonMapper.class)
              .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.http.converter.autoconfigure.JacksonHttpMessageConvertersConfiguration$JacksonJsonHttpMessageConverterConfiguration", JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConverterConfiguration.class).jacksonJsonHttpMessageConvertersCustomizer(args.get(0)));
    }

    /**
     * Get the bean definition for 'jacksonJsonHttpMessageConvertersCustomizer'.
     */
    public static BeanDefinition getJacksonJsonHttpMessageConvertersCustomizerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(JacksonHttpMessageConvertersConfiguration.JacksonJsonHttpMessageConvertersCustomizer.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.http.converter.autoconfigure.JacksonHttpMessageConvertersConfiguration$JacksonJsonHttpMessageConverterConfiguration");
      beanDefinition.setInstanceSupplier(getJacksonJsonHttpMessageConvertersCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
