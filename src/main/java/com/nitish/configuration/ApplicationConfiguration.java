package com.nitish.configuration;

import com.nitish.data.SurveyData;
import com.nitish.services.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;


//way of creating a spring java configuration for beans
@Configuration
//@Import(InfrastructureConfiguration.class) //-- to import java configuration
//@ImportResource -- to import xml configuration file.
@ComponentScan(basePackages = "com.nitish")
public class ApplicationConfiguration {

    @Autowired
    public DataSource ds;

@Bean
    public SurveyService getService(){
        return new SurveyService();
    }

@Bean
    public SurveyData getSurveyData(){
        return new SurveyData(ds);
    }


}
