package org.springframework.boot.data.autoconfigure.web;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer;
import org.springframework.data.web.config.SortHandlerMethodArgumentResolverCustomizer;
import org.springframework.data.web.config.SpringDataWebSettings;

/**
 * Bean definitions for {@link DataWebAutoConfiguration}.
 */
@Generated
public class DataWebAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'org.springframework.boot.data.autoconfigure.web.DataWebAutoConfiguration'.
   */
  private static BeanInstanceSupplier<DataWebAutoConfiguration> getDataWebAutoConfigurationInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DataWebAutoConfiguration>forConstructor(DataWebProperties.class)
            .withGenerator((registeredBean, args) -> new DataWebAutoConfiguration(args.get(0)));
  }

  /**
   * Get the bean definition for 'dataWebAutoConfiguration'.
   */
  public static BeanDefinition getDataWebAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataWebAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(getDataWebAutoConfigurationInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'pageableCustomizer'.
   */
  private static BeanInstanceSupplier<PageableHandlerMethodArgumentResolverCustomizer> getPageableCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<PageableHandlerMethodArgumentResolverCustomizer>forFactoryMethod(DataWebAutoConfiguration.class, "pageableCustomizer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.data.autoconfigure.web.DataWebAutoConfiguration", DataWebAutoConfiguration.class).pageableCustomizer());
  }

  /**
   * Get the bean definition for 'pageableCustomizer'.
   */
  public static BeanDefinition getPageableCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(PageableHandlerMethodArgumentResolverCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.data.autoconfigure.web.DataWebAutoConfiguration");
    beanDefinition.setInstanceSupplier(getPageableCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'sortCustomizer'.
   */
  private static BeanInstanceSupplier<SortHandlerMethodArgumentResolverCustomizer> getSortCustomizerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SortHandlerMethodArgumentResolverCustomizer>forFactoryMethod(DataWebAutoConfiguration.class, "sortCustomizer")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.data.autoconfigure.web.DataWebAutoConfiguration", DataWebAutoConfiguration.class).sortCustomizer());
  }

  /**
   * Get the bean definition for 'sortCustomizer'.
   */
  public static BeanDefinition getSortCustomizerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SortHandlerMethodArgumentResolverCustomizer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.data.autoconfigure.web.DataWebAutoConfiguration");
    beanDefinition.setInstanceSupplier(getSortCustomizerInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'springDataWebSettings'.
   */
  private static BeanInstanceSupplier<SpringDataWebSettings> getSpringDataWebSettingsInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SpringDataWebSettings>forFactoryMethod(DataWebAutoConfiguration.class, "springDataWebSettings")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.data.autoconfigure.web.DataWebAutoConfiguration", DataWebAutoConfiguration.class).springDataWebSettings());
  }

  /**
   * Get the bean definition for 'springDataWebSettings'.
   */
  public static BeanDefinition getSpringDataWebSettingsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringDataWebSettings.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.data.autoconfigure.web.DataWebAutoConfiguration");
    beanDefinition.setInstanceSupplier(getSpringDataWebSettingsInstanceSupplier());
    return beanDefinition;
  }
}
