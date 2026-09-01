package org.springframework.boot.web.server.autoconfigure.servlet;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.web.server.autoconfigure.ServerProperties;

/**
 * Bean definitions for {@link ServletWebServerConfiguration}.
 */
@Generated
public class ServletWebServerConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'servletWebServerConfiguration'.
   */
  public static BeanDefinition getServletWebServerConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletWebServerConfiguration.class);
    beanDefinition.setInstanceSupplier(ServletWebServerConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'servletWebServerFactoryCustomizer'.
   */
  private static BeanInstanceSupplier<ServletWebServerFactoryCustomizer> getServletWebServerFactoryCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ServletWebServerFactoryCustomizer>forFactoryMethod(ServletWebServerConfiguration.class, "servletWebServerFactoryCustomizer", ServerProperties.class, ObjectProvider.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.web.server.autoconfigure.servlet.ServletWebServerConfiguration", ServletWebServerConfiguration.class).servletWebServerFactoryCustomizer(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'servletWebServerFactoryCustomizer'.
   */
  public static BeanDefinition getServletWebServerFactoryCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ServletWebServerFactoryCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.web.server.autoconfigure.servlet.ServletWebServerConfiguration");
    beanDefinition.setInstanceSupplier(getServletWebServerFactoryCustomizerInstanceSupplier());
    return beanDefinition;
  }
}
