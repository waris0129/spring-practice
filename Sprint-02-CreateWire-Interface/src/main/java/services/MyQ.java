package services;

import implementations.Wire;

public class MyQ implements Wire {
    @Override
    public void callWire() {
        System.out.println("Wire is created by MyQ.");
    }
}
