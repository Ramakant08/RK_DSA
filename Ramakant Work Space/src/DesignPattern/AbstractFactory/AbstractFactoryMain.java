package DesignPattern.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(employee.name()+"  "+employee.salary());
    }
}
