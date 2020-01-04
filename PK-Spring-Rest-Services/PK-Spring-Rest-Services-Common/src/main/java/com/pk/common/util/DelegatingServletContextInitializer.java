
package com.pk.common.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.web.WebApplicationInitializer;

public class DelegatingServletContextInitializer
        implements ServletContextInitializer {

    private WebApplicationInitializer applicationInitializer;

    public DelegatingServletContextInitializer(WebApplicationInitializer applicationInitializer) {
        this.applicationInitializer = applicationInitializer;
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        applicationInitializer.onStartup(servletContext);
    }
}
