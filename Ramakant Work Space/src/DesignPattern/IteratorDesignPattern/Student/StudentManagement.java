package DesignPattern.IteratorDesignPattern.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    List<Student>list=new ArrayList<>();

    public void addStudent(Student student){
        this.list.add(student);
    }

    public void getStudent(int index){
        this.list.get(index);
    }

    public MyIterator getIterator(){
        return new MyIteratorImpl(this.list);
    }
}
