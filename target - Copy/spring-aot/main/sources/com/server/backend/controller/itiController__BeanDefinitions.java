package com.server.backend.controller;

import com.server.backend.service.ItiService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link itiController}.
 */
@Generated
public class itiController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'itiController'.
   */
  private static BeanInstanceSupplier<itiController> getItiControllerInstanceSupplier() {
    return BeanInstanceSupplier.<itiController>forConstructor(ItiService.class)
            .withGenerator((registeredBean, args) -> new itiController(args.get(0)));
  }

  /**
   * Get the bean definition for 'itiController'.
   */
  public static BeanDefinition getItiControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(itiController.class);
    beanDefinition.setInstanceSupplier(getItiControllerInstanceSupplier());
    return beanDefinition;
  }
}
