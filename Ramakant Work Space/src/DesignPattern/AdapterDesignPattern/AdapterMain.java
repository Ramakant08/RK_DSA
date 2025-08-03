package DesignPattern.AdapterDesignPattern;

public class AdapterMain {
    public static void main(String[] args) {
         AppleCharger appleCharger=new AdapterCharger(new ChargerABCD());
        Iphone13 iphone13=new Iphone13(appleCharger);
        iphone13.chargeIphone();
    }
}
