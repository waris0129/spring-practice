package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.CourseSession;

public class Java implements Course {

    private  CourseSession courseSession;

    public Java(CourseSession courseSession){
        this.courseSession = courseSession;
    }


    @Override
    public void teaching() {
        System.out.println("teaching Java class "+courseSession.teachingHour()+" hours.");
    }
}
