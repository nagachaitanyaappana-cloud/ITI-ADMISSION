package com.server.backend.controller;

import com.server.backend.service.ReportService;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RestReportController}.
 */
@Generated
public class RestReportController__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'restReportController'.
   */
  private static BeanInstanceSupplier<RestReportController> getRestReportControllerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<RestReportController>forConstructor(ReportService.class)
            .withGenerator((registeredBean, args) -> new RestReportController(args.get(0)));
  }

  /**
   * Get the bean definition for 'restReportController'.
   */
  public static BeanDefinition getRestReportControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RestReportController.class);
    beanDefinition.setInstanceSupplier(getRestReportControllerInstanceSupplier());
    return beanDefinition;
  }
}
