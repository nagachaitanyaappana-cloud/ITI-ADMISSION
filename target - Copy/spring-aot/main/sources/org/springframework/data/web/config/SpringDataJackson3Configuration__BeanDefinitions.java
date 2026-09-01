package org.springframework.data.web.config;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.data.geo.GeoJacksonModule;

/**
 * Bean definitions for {@link SpringDataJackson3Configuration}.
 */
@Generated
public class SpringDataJackson3Configuration__BeanDefinitions {
  /**
   * Get the bean definition for 'springDataJackson3Configuration'.
   */
  public static BeanDefinition getSpringDataJacksonConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringDataJackson3Configuration.class);
    InstanceSupplier<SpringDataJackson3Configuration> instanceSupplier = InstanceSupplier.using(SpringDataJackson3Configuration::new);
    instanceSupplier = instanceSupplier.andThen(SpringDataJackson3Configuration__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jackson3GeoModule'.
   */
  private static BeanInstanceSupplier<GeoJacksonModule> getJacksonGeoModuleInstanceSupplier() {
    return BeanInstanceSupplier.<GeoJacksonModule>forFactoryMethod(SpringDataJackson3Configuration.class, "jackson3GeoModule")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.data.web.config.SpringDataJackson3Configuration", SpringDataJackson3Configuration.class).jackson3GeoModule());
  }

  /**
   * Get the bean definition for 'jackson3GeoModule'.
   */
  public static BeanDefinition getJacksonGeoModuleBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GeoJacksonModule.class);
    beanDefinition.setFactoryBeanName("org.springframework.data.web.config.SpringDataJackson3Configuration");
    beanDefinition.setInstanceSupplier(getJacksonGeoModuleInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'jackson3pageModule'.
   */
  private static BeanInstanceSupplier<SpringDataJackson3Configuration.PageModule> getJacksonpageModuleInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<SpringDataJackson3Configuration.PageModule>forFactoryMethod(SpringDataJackson3Configuration.class, "jackson3pageModule")
            .withGenerator((registeredBean) -> registeredBean.getBeanFactory().getBean("org.springframework.data.web.config.SpringDataJackson3Configuration", SpringDataJackson3Configuration.class).jackson3pageModule());
  }

  /**
   * Get the bean definition for 'jackson3pageModule'.
   */
  public static BeanDefinition getJacksonpageModuleBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SpringDataJackson3Configuration.PageModule.class);
    beanDefinition.setFactoryBeanName("org.springframework.data.web.config.SpringDataJackson3Configuration");
    beanDefinition.setInstanceSupplier(getJacksonpageModuleInstanceSupplier());
    return beanDefinition;
  }
}
