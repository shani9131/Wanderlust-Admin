package com.travel.jar.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Yeh sabhi API endpoints par apply hoga (e.g., /api/auth/login, /api/customers/add)
                .allowedOrigins("*") // Yeh kisi bhi origin (file://, http://localhost:5500, etc.) se requests allow karega
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*");
    }
}