import services.CallWires;
import services.MyQ;

public class Transaction {

    public static void main(String[] args) {
        MyQ myQ  = new MyQ();


        CallWires wire = new CallWires();

        wire.setWire(myQ);

        wire.callWire();

    }



}





