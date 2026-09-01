package org.springframework.boot.tomcat.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.web.server.autoconfigure.ServerProperties;
import org.springframework.core.env.Environment;

/**
 * Bean definitions for {@link TomcatWebServerConfiguration}.
 */
@Generated
public class TomcatWebServerConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'tomcatWebServerConfiguration'.
   */
  public static BeanDefinition getTomcatWebServerConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TomcatWebServerConfiguration.class);
    beanDefinition.setInstanceSupplier(TomcatWebServerConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'tomcatWebServerFactoryCustomizer'.
   */
  private static BeanInstanceSupplier<TomcatWebServerFactoryCustomizer> getTomcatWebServerFactoryCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<TomcatWebServerFactoryCustomizer>forFactoryMethod(TomcatWebServerConfiguration.class, "tomcatWebServerFactoryCustomizer", Environment.class, ServerProperties.class, TomcatServerProperties.class, WebProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.tomcat.autoconfigure.TomcatWebServerConfiguration", TomcatWebServerConfiguration.class).tomcatWebServerFactoryCustomizer(args.get(0), args.get(1), args.get(2), args.get(3)));
  }

  /**
   * Get the bean definition for 'tomcatWebServerFactoryCustomizer'.
   */
  public static BeanDefinition getTomcatWebServerFactoryCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TomcatWebServerFactoryCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.tomcat.autoconfigure.TomcatWebServerConfiguration");
    beanDefinition.setInstanceSupplier(getTomcatWebServerFactoryCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Bean definitions for {@link TomcatWebServerConfiguration.TomcatWebSocketConfiguration}.
   */
  @Generated
  public static class TomcatWebSocketConfiguration {
    /**
     * Get the bean definition for 'tomcatWebSocketConfiguration'.
     */
    public static BeanDefinition getTomcatWebSocketConfigurationBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(TomcatWebServerConfiguration.TomcatWebSocketConfiguration.class);
      beanDefinition.setInstanceSupplier(TomcatWebServerConfiguration.TomcatWebSocketConfiguration::new);
      return beanDefinition;
    }

    /**
     * Get the bean instance supplier for 'webSocketWebServerCustomizer'.
     */
    private static BeanInstanceSupplier<WebSocketTomcatWebServerFactoryCustomizer> getWebSocketWebServerCustomizerInstanceSupplier(
        ) {
      return BeanInstanceSupplier.<WebSocketTomcatWebServerFactoryCustomizer>forFactoryMethod(TomcatWebServerConfiguration.TomcatWebSocketConfiguration.class, "webSocketWebServerCustomizer")
              .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.tomcat.autoconfigure.TomcatWebServerConfiguration$TomcatWebSocketConfiguration", TomcatWebServerConfiguration.TomcatWebSocketConfiguration.class).webSocketWebServerCustomizer());
    }

    /**
     * Get the bean definition for 'webSocketWebServerCustomizer'.
     */
    public static BeanDefinition getWebSocketWebServerCustomizerBeanDefinition() {
      RootBeanDefinition beanDefinition = new RootBeanDefinition(WebSocketTomcatWebServerFactoryCustomizer.class);
      beanDefinition.setFactoryBeanName("org.springframework.boot.tomcat.autoconfigure.TomcatWebServerConfiguration$TomcatWebSocketConfiguration");
      beanDefinition.setInstanceSupplier(getWebSocketWebServerCustomizerInstanceSupplier());
      return beanDefinition;
    }
  }
}
