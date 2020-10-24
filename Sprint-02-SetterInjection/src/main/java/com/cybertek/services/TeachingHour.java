package com.cybertek.services;

import com.cybertek.interfaces.SessionHour;

public class TeachingHour implements SessionHour {
    @Override
    public int getHours(int i) {
        return i;
    }
}
