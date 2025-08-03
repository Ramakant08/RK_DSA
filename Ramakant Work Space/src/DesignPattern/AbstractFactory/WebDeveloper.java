package DesignPattern.AbstractFactory;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        return 100000;
    }

    @Override
    public String name() {
        return "I am a web Developer";
    }
}
