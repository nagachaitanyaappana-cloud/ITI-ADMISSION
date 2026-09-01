package org.springframework.boot.tomcat.autoconfigure.servlet;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.tomcat.autoconfigure.TomcatServerProperties;
import org.springframework.boot.tomcat.servlet.TomcatServletWebServerFactory;

/**
 * Bean definitions for {@link TomcatServletWebServerAutoConfiguration}.
 */
@Generated
public class TomcatServletWebServerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.tomcat.autoconfigure.servlet.TomcatServletWebServerAutoConfiguration'.
   */
  private static BeanInstanceSupplier<TomcatServletWebServerAutoConfiguration> getTomcatServletWebServerAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TomcatServletWebServerAutoConfiguration>forConstructor(TomcatServerProperties.class)
            .withGenerator((registeredBean, args) -> new TomcatServletWebServerAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'tomcatServletWebServerAutoConfiguration'.
   */
  public static BeanDefinition getTomcatServletWebServerAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TomcatServletWebServerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getTomcatServletWebServerAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'tomcatServletWebServerFactory'.
   */
  private static BeanInstanceSupplier<TomcatServletWebServerFactory> getTomcatServletWebServerFactoryInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TomcatServletWebServerFactory>forFactoryMethod(TomcatServletWebServerAutoConfiguration.class, "tomcatServletWebServerFactory", ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.tomcat.autoconfigure.servlet.TomcatServletWebServerAutoConfiguration", TomcatServletWebServerAutoConfiguration.class).tomcatServletWebServerFactory(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'tomcatServletWebServerFactory'.
   */
  public static BeanDefinition getTomcatServletWebServerFactoryBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TomcatServletWebServerFactory.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.tomcat.autoconfigure.servlet.TomcatServletWebServerAutoConfiguration");
    beanDefinition.setInstanceSupplier(getTomcatServletWebServerFactoryInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'tomcatServletWebServerFactoryCustomizer'.
   */
  private static BeanInstanceSupplier<TomcatServletWebServerFactoryCustomizer> getTomcatServletWebServerFactoryCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TomcatServletWebServerFactoryCustomizer>forFactoryMethod(TomcatServletWebServerAutoConfiguration.class, "tomcatServletWebServerFactoryCustomizer", TomcatServerProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.tomcat.autoconfigure.servlet.TomcatServletWebServerAutoConfiguration", TomcatServletWebServerAutoConfiguration.class).tomcatServletWebServerFactoryCustomizer(args.get(0)));
  }

  /**
   * Get the bean definition for 'tomcatServletWebServerFactoryCustomizer'.
   */
  public static BeanDefinition getTomcatServletWebServerFactoryCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TomcatServletWebServerFactoryCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.tomcat.autoconfigure.servlet.TomcatServletWebServerAutoConfiguration");
    beanDefinition.setInstanceSupplier(getTomcatServletWebServerFactoryCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
