package DesignPattern.Fctory;

public class EmployeeFactory {

    public static Employee getEmployeeSalary(String object) {
        if (object.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {
            return new AndroidDeveloper();
        } else if (object.trim().equalsIgnoreCase("WEB DEVELOPER")) {
            return new WebDeveloper();
        } else {
            return null;
        }
    }
}
