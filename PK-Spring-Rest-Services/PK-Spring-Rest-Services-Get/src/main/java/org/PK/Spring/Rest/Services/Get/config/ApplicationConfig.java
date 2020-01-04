
package org.PK.Spring.Rest.Services.Get.config;

import org.PK.Spring.Rest.Services.Get.AppConfigPackageMarker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;


@ComponentScan(basePackageClasses = {
        AppConfigPackageMarker.class
     },
  excludeFilters = {
      @ComponentScan.Filter(type=FilterType.REGEX, pattern="org.*.main.Application")
  }
)

@Configuration
public class ApplicationConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
