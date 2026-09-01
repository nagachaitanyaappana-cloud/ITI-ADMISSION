package org.springframework.aop.framework;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ProxyConfig}.
 */
@Generated
public class ProxyConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'defaultProxyConfig'.
   */
  public static BeanDefinition getDefaultProxyConfigBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ProxyConfig.class);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.getPropertyValues().addPropertyValue("proxyTargetClass", true);
    beanDefinition.setInstanceSupplier(ProxyConfig::new);
    return beanDefinition;
  }
}
