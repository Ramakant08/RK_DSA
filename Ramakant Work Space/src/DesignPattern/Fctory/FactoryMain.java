package DesignPattern.Fctory;

/**
 * Factory Design Pattern is used when there is a super class and multiple subclasses and we want to uae the object
 * of subclasses based on the input provided
 *
 * Advantages
 * focus is more on creating the object of interface rather than implementations
 * Provides lose coupling and more robust code
 */

public class FactoryMain {
    public static void main(String[] args) {
        Employee employee= EmployeeFactory.getEmployeeSalary("WEB DEVELOPER");
        Employee employee1= EmployeeFactory.getEmployeeSalary("ANDROID DEVELOPER");
        System.out.println(employee.salary());
        System.out.println(employee1.salary());


    }
}
