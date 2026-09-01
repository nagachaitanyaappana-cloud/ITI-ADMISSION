package org.springframework.boot.jdbc.autoconfigure;

import javax.sql.DataSource;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.sql.autoconfigure.init.SqlInitializationProperties;

/**
 * Bean definitions for {@link DataSourceInitializationAutoConfiguration}.
 */
@Generated
public class DataSourceInitializationAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'dataSourceInitializationAutoConfiguration'.
   */
  public static BeanDefinition getDataSourceInitializationAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DataSourceInitializationAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(DataSourceInitializationAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'dataSourceScriptDatabaseInitializer'.
   */
  private static BeanInstanceSupplier<ApplicationDataSourceScriptDatabaseInitializer> getDataSourceScriptDatabaseInitializerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<ApplicationDataSourceScriptDatabaseInitializer>forFactoryMethod(DataSourceInitializationAutoConfiguration.class, "dataSourceScriptDatabaseInitializer", DataSource.class, SqlInitializationProperties.class)
            .withGenerator((registeredBean, args) -> registeredBean.getBeanFactory().getBean("org.springframework.boot.jdbc.autoconfigure.DataSourceInitializationAutoConfiguration", DataSourceInitializationAutoConfiguration.class).dataSourceScriptDatabaseInitializer(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'dataSourceScriptDatabaseInitializer'.
   */
  public static BeanDefinition getDataSourceScriptDatabaseInitializerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ApplicationDataSourceScriptDatabaseInitializer.class);
    beanDefinition.setFactoryBeanName("org.springframework.boot.jdbc.autoconfigure.DataSourceInitializationAutoConfiguration");
    beanDefinition.setInstanceSupplier(getDataSourceScriptDatabaseInitializerInstanceSupplier());
    return beanDefinition;
  }
}
