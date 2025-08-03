package DesignPattern.AdapterDesignPattern;

public class AdapterCharger implements AppleCharger {
    AndroidCharger androidCharger;

    AdapterCharger (AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargeIphone() {
        System.out.println("Charging with android charger");
    }
}
