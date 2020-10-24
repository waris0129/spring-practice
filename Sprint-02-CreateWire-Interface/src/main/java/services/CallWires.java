package services;

import implementations.Wire;

public class CallWires {

    private Wire wire;

    public void setWire(Wire wire){
        this.wire = wire;
    }

    public Wire getWire(){
        return this.wire;
    }

    public void callWire(){
        this.wire.callWire();
    }




}
