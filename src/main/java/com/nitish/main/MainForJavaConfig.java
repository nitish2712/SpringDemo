package com.nitish.main;

import com.nitish.configuration.ApplicationConfiguration;
import com.nitish.data.SurveyData;
import com.nitish.data.UserData;
import com.nitish.services.SurveyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class MainForJavaConfig {

    public static void main(String []args){

        ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        System.out.println("This is an instance of bean :"+ac.getBean("getService"));
        System.out.println("This is an instance of same bean showing spring keeps bean singleton by default :"
                +ac.getBean("getService"));
        SurveyService ss = ac.getBean("getService",SurveyService.class);
        UserData user = ss.getUser();
        System.out.println("using setter injection "+ user);

        SurveyData sd = ac.getBean("getSurveyData",SurveyData.class);
        DataSource ds = sd.getDs();
        System.out.println("using Constructor injection "+ ds);

        System.out.println(ac.getBeanDefinitionCount());
        for (String name: ac.getBeanDefinitionNames() ) {
            System.out.println(name);
        }


    }

}
