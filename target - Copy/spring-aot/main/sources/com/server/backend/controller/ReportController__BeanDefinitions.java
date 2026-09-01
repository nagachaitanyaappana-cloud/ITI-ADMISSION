package com.server.backend.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReportController}.
 */
@Generated
public class ReportController__BeanDefinitions {
  /**
   * Get the bean definition for 'reportController'.
   */
  public static BeanDefinition getReportControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReportController.class);
    beanDefinition.setInstanceSupplier(ReportController::new);
    return beanDefinition;
  }
}
