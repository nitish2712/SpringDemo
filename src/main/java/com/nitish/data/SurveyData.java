package com.nitish.data;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

@Component
public class SurveyData {


    private DataSource ds;
    public SurveyData(DataSource ds){
        this.ds = ds;
    }

    private List<String> survey;

    public DataSource getDs(){
        return  ds;
    }

    public List<String> getSurvey() {
        return survey;
    }

    public void setSurvey(List<String> survey) {
        this.survey = survey;
    }
}
