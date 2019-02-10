package com.nitish.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class InfrastructureConfiguration {

    @Bean
    public DataSource dataSource(){
        return new DriverManagerDataSource();
    }

}
