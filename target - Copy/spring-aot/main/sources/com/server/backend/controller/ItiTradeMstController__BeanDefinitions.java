package com.server.backend.controller;

import com.server.backend.service.ItiTradeMstService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ItiTradeMstController}.
 */
@Generated
public class ItiTradeMstController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'itiTradeMstController'.
   */
  private static BeanInstanceSupplier<ItiTradeMstController> getItiTradeMstControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ItiTradeMstController>forConstructor(ItiTradeMstService.class)
            .withGenerator((registeredBean, args) -> new ItiTradeMstController(args.get(0)));
  }

  /**
   * Get the bean definition for 'itiTradeMstController'.
   */
  public static BeanDefinition getItiTradeMstControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ItiTradeMstController.class);
    beanDefinition.setInstanceSupplier(getItiTradeMstControllerInstanceSupplier());
    return beanDefinition;
  }
}
