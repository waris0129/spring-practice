package services;

import implementations.Wire;

public class ClientCentral implements Wire {
    @Override
    public void callWire() {
        System.out.println("Wire is created by Client Central.");
    }
}
