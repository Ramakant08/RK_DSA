package DesignPattern.IteratorDesignPattern.Student;

public class IteratorMain {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent(new Student("Ramakant", 1234));
        studentManagement.addStudent(new Student("Rajat", 1235));
        studentManagement.addStudent(new Student("Rishi", 1236));
        studentManagement.addStudent(new Student("Ritwik", 1237));
        studentManagement.addStudent(new Student("Ratan", 1238));

        MyIterator iterator=studentManagement.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
