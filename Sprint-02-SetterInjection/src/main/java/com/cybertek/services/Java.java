package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.SessionHour;

public class Java implements Course {

    private SessionHour sessionHour;

    public void setSessionHour(SessionHour sessionHour){
        this.sessionHour = sessionHour;
    }

    public SessionHour getSessionHour(){
        return this.sessionHour;
    }

    @Override
    public void teachingCourse() {
        System.out.println("Teaching Java course " + sessionHour.getHours(10)+" hours.");
    }
}
