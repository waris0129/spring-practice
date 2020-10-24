package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.SessionHour;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Selenium implements Course {

    private SessionHour sessionHour;

    @Override
    public void teachingCourse() {
        System.out.println("Teaching Selenium course "+sessionHour.getHours(20) +" hours.");
    }
}
