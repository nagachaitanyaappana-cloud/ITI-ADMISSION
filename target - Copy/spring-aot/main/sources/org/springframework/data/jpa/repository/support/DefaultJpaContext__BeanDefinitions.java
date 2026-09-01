package org.springframework.data.jpa.repository.support;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DefaultJpaContext}.
 */
@Generated
public class DefaultJpaContext__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'jpaContext'.
   */
  private static BeanInstanceSupplier<DefaultJpaContext> getJpaContextInstanceSupplier() {
    return BeanInstanceSupplier.<DefaultJpaContext>forConstructor(ObjectProvider.class)
            .withGenerator((registeredBean, args) -> new DefaultJpaContext(args.get(0, ObjectProvider.class)));
  }

  /**
   * Get the bean definition for 'jpaContext'.
   */
  public static BeanDefinition getJpaContextBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DefaultJpaContext.class);
    beanDefinition.setLazyInit(true);
    beanDefinition.setInstanceSupplier(getJpaContextInstanceSupplier());
    return beanDefinition;
  }
}
