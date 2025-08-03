package DesignPattern.AdapterDesignPattern;

public class ChargerABCD implements AndroidCharger {
    @Override
    public void chargeAndroid() {
        System.out.println("Charging Android Phone");
    }
}
