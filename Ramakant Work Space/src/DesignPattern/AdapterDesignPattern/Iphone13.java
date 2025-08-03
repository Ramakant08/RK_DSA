package DesignPattern.AdapterDesignPattern;

public class Iphone13 {
    AppleCharger appleCharger;

    public Iphone13(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void chargeIphone() {
        appleCharger.chargeIphone();
    }
}
