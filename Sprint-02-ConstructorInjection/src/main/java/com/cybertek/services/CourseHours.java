package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.CourseSession;

public class CourseHours implements CourseSession {

    @Override
    public int teachingHour() {
        return 90;
    }
}
