package com.server.backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.server.backend.Repository.DbConnectionChecker; 

@SpringBootApplication
public class BackendApplication extends SpringBootServletInitializer {

    // Used by external Tomcat 10 to boot the WAR
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BackendApplication.class);
    }

    // MANDATORY for local testing without an installed Tomcat server
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    // Runs automatically after the context loads (Works on BOTH local embedded and external Tomcat)
    @Bean
    public CommandLineRunner runDbCheck(DbConnectionChecker dbChecker) {
        return args -> {
            dbChecker.checkConnection();    
        };
}