package org.springframework.boot.validation.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

/**
 * Bean definitions for {@link ValidationAutoConfiguration}.
 */
@Generated
public class ValidationAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'validationAutoConfiguration'.
   */
  public static BeanDefinition getValidationAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValidationAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(ValidationAutoConfiguration::new);
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'defaultValidator'.
   */
  private static BeanInstanceSupplier<LocalValidatorFactoryBean> getDefaultValidatorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<LocalValidatorFactoryBean>forFactoryMethod(ValidationAutoConfiguration.class, "defaultValidator", ApplicationContext.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> ValidationAutoConfiguration.defaultValidator(args.get(0), args.get(1)));
  }

  /**
   * Get the bean definition for 'defaultValidator'.
   */
  public static BeanDefinition getDefaultValidatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValidationAutoConfiguration.class);
    beanDefinition.setTargetType(LocalValidatorFactoryBean.class);
    beanDefinition.setPrimary(true);
    beanDefinition.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
    beanDefinition.setInstanceSupplier(getDefaultValidatorInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'methodValidationPostProcessor'.
   */
  private static BeanInstanceSupplier<MethodValidationPostProcessor> getMethodValidationPostProcessorInstanceSupplier(
      ) {
    return BeanInstanceSupplier.<MethodValidationPostProcessor>forFactoryMethod(ValidationAutoConfiguration.class, "methodValidationPostProcessor", Environment.class, ObjectProvider.class, ObjectProvider.class)
            .withGenerator((registeredBean, args) -> ValidationAutoConfiguration.methodValidationPostProcessor(args.get(0), args.get(1), args.get(2)));
  }

  /**
   * Get the bean definition for 'methodValidationPostProcessor'.
   */
  public static BeanDefinition getMethodValidationPostProcessorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ValidationAutoConfiguration.class);
    beanDefinition.setTargetType(MethodValidationPostProcessor.class);
    beanDefinition.setInstanceSupplier(getMethodValidationPostProcessorInstanceSupplier());
    return beanDefinition;
  }
}
