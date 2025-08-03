package DesignPattern.Observer;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;

    }

    @Override
    public void notified(String vedioname) {
        System.out.println("Hi " + this.name + " new vedio: " + vedioname + " is uploaded");
    }
}
