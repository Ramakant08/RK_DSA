package DesignPattern.AbstractFactory;

public class AndroidDevFactory extends EmployAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new AndroidDeveloper();
    }
}
