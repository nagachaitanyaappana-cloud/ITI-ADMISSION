package org.springframework.boot.data.jpa.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.LazyInitializationExcludeFilter;

/**
 * Bean definitions for {@link DataJpaRepositoriesAutoConfiguration}.
 */
@Generated
public class DataJpaRepositoriesAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dataJpaRepositoriesAutoConfiguration'.
   */
  public static BeanDefinition getDataJpaRepositoriesAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataJpaRepositoriesAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(DataJpaRepositoriesAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean definition for 'eagerJpaMetamodelCacheCleanup'.
   */
  public static BeanDefinition getEagerJpaMetamodelCacheCleanupBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataJpaRepositoriesAutoConfiguration.class);
    beanDefinition.setTargetType(LazyInitializationExcludeFilter.class);
    beanDefinition.setInstanceSupplier(BeanInstanceSupplier.<LazyInitializationExcludeFilter>forFactoryMethod(DataJpaRepositoriesAutoConfiguration.class, "eagerJpaMetamodelCacheCleanup").withGenerator((registeredBean) -> DataJpaRepositoriesAutoConfiguration.eagerJpaMetamodelCacheCleanup()));
    return beanDefinition;
  }
}
