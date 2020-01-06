
package org.PK.Spring.Rest.Services.Get.config;

import org.PK.Spring.Rest.Services.Get.AppConfigPackageMarker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pk.common.exception.CustomExceptionHandler;


@ComponentScan(basePackageClasses = {
        AppConfigPackageMarker.class,
        CustomExceptionHandler.class
     },
  excludeFilters = {
      @ComponentScan.Filter(type=FilterType.REGEX, pattern="org.*.main.Application")
  }
)
@EnableAspectJAutoProxy
@Configuration
public class ApplicationConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
