package DesignPattern.Fctory;

public class WebDeveloper implements Employee{

    public int salary() {
        System.out.println("Getting Salary Of Web Developer");
        return 50000;
    }
}
