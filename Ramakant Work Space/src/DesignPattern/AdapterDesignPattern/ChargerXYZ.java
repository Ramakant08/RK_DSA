package DesignPattern.AdapterDesignPattern;

public class ChargerXYZ implements AppleCharger{
    @Override
    public void chargeIphone() {
        System.out.println("Your Iphone is charging");
    }
}
