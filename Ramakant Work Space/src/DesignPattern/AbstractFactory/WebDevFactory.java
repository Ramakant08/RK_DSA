package DesignPattern.AbstractFactory;
public class WebDevFactory extends EmployAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new WebDeveloper();
    }
}
