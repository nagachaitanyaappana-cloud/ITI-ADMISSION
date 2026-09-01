package org.springframework.boot.jackson;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JacksonMixinModuleEntries}.
 */
@Generated
public class JacksonMixinModuleEntries__BeanDefinitions {
  /**
   * Get the bean instance for 'jacksonMixinModuleEntries'.
   */
  private static JacksonMixinModuleEntries getJacksonMixinModuleEntriesInstance() {
    return JacksonMixinModuleEntries.create((mixins) -> {
    } );
  }

  /**
   * Get the bean definition for 'jacksonMixinModuleEntries'.
   */
  public static BeanDefinition getJacksonMixinModuleEntriesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition("org.springframework.boot.jackson.autoconfigure.JacksonAutoConfiguration$JacksonMixinConfiguration");
    beanDefinition.setTargetType(JacksonMixinModuleEntries.class);
    beanDefinition.setInstanceSupplier(JacksonMixinModuleEntries__BeanDefinitions::getJacksonMixinModuleEntriesInstance);
    return beanDefinition;
  }
}
