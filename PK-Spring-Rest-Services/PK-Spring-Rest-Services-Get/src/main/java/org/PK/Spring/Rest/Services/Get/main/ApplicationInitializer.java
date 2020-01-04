package org.PK.Spring.Rest.Services.Get.main;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

import org.PK.Spring.Rest.Services.Get.config.WebConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.pk.common.util.ServletUrlMapping;
import com.pk.common.util.WebConfigDetails;

/**
 * This class initializes the web application context (the web app equivalent to the "main" class in
 * a standalone app) WebApplicationInitializer classes are detected *automatically* by Spring and
 * may be located anywhere in the classpath. This file should not require modification (except to
 * possibly add/configure filters)
 *
 *************************************************************
 * REQUIRES Java 7, Servlet 3.0 API, and therefore Tomcat 7 *
 *************************************************************
 */

public class ApplicationInitializer implements WebApplicationInitializer {

    private static final String SECURE_JAS_DISPATCHER_MAPPING = "/create-service/secure/jas/*";

    @Override
    public void onStartup(ServletContext servletContext) {
      registerAndMapDispatcherServlet(servletContext);
    }

    protected AnnotationConfigWebApplicationContext registerAndMapDispatcherServlet(
        ServletContext servletContext) {
      AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
      dispatcherContext.register(WebConfig.class);

      final String dispatcherMappingUrl = ServletUrlMapping.builder()
          .withServletContextAs(servletContext)
          .withSubFunctionGroupAs(WebConfigDetails.SUB_FUNC_GROUP)
          .withDispatcherMappingUrlAs(SECURE_JAS_DISPATCHER_MAPPING)
          .build().getMappingUrl();
      final ServletRegistration.Dynamic dispatcher = servletContext
          .addServlet("getMODULE_NAME_v2_0_DispatcherServlet",
              new DispatcherServlet(dispatcherContext));
      dispatcher.setLoadOnStartup(1);
      dispatcher.addMapping(dispatcherMappingUrl);

      return dispatcherContext;
    }
}