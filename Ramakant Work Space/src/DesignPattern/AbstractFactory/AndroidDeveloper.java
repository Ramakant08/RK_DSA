package DesignPattern.AbstractFactory;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        return 90000;
    }

    @Override
    public String name() {
        return "I am an android developer";
    }
}
