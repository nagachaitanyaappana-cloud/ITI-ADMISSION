package com.server.backend.service;

import com.server.backend.Repository.DistrictMasterRepository;
import com.server.backend.Repository.ItiRepository;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReportServiceImpl}.
 */
@Generated
public class ReportServiceImpl__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'reportServiceImpl'.
   */
  private static BeanInstanceSupplier<ReportServiceImpl> getReportServiceImplInstanceSupplier() {
    return BeanInstanceSupplier.<ReportServiceImpl>forConstructor(DistrictMasterRepository.class, ItiRepository.class)
            .withGenerator((registeredBean, args) -> new ReportServiceImpl(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'reportServiceImpl'.
   */
  public static BeanDefinition getReportServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReportServiceImpl.class);
    beanDefinition.setInstanceSupplier(getReportServiceImplInstanceSupplier());
    return beanDefinition;
  }
}
