package com.server.backend.Repository;

import javax.sql.DataSource;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DbConnectionChecker}.
 */
@Generated
public class DbConnectionChecker__BeanDefinitions {
  /**
   * Get the bean instance supplier for 'dbConnectionChecker'.
   */
  private static BeanInstanceSupplier<DbConnectionChecker> getDbConnectionCheckerInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<DbConnectionChecker>forConstructor(DataSource.class)
            .withGenerator((registeredBean, args) -> new DbConnectionChecker(args.get(0)));
  }

  /**
   * Get the bean definition for 'dbConnectionChecker'.
   */
  public static BeanDefinition getDbConnectionCheckerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DbConnectionChecker.class);
    beanDefinition.setInitMethodNames("checkConnection");
    beanDefinition.setInstanceSupplier(getDbConnectionCheckerInstanceSupplier());
    return beanDefinition;
  }
}
