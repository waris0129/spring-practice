package com.cybertek.services;

import com.cybertek.interfaces.Course;

public class Selenium implements Course {

    @Override
    public void teaching() {
        System.out.println("Teaching Selenium course");
    }
}
