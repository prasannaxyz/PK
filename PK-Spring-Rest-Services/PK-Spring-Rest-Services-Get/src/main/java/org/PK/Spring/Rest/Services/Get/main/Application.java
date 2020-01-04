
package org.PK.Spring.Rest.Services.Get.main;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.jetty.JettyEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pk.common.util.DelegatingServletContextInitializer;
import com.pk.common.util.WebConfigDetails;

@Configuration
public class Application {

    public static void main(String[] args) {
        System.setProperty("pk.implementation.environment", "dev");
        SpringApplication.run(Application.class, args); 
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        JettyEmbeddedServletContainerFactory factory = new JettyEmbeddedServletContainerFactory();
        factory.setSessionTimeout(5, TimeUnit.MINUTES);
        factory.setPort(8080);
        factory.setContextPath(WebConfigDetails.CONTEXT_PATH);
        factory.addInitializers(new DelegatingServletContextInitializer(new ApplicationInitializer()));
        return factory;
    }

}
