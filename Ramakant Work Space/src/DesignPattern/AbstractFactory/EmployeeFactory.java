package DesignPattern.AbstractFactory;


public class EmployeeFactory {
     public static Employee getEmployee(EmployAbstractFactory abstractFactory){
         return abstractFactory.createEmployee();
     }
}
