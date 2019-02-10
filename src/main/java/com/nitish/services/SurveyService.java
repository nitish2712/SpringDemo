package com.nitish.services;

import com.nitish.data.UserData;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SurveyService {
    @Autowired
    private UserData user;

    public UserData getUser() {
        return user;
    }

public List<String> create(){

    return null;
}

}
