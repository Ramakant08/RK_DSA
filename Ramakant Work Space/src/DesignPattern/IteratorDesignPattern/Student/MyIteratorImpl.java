package DesignPattern.IteratorDesignPattern.Student;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {
    List<Student> list = new ArrayList<>();
    int position = 0;
    int size;

    public MyIteratorImpl(List<Student> list) {
        this.list = list;
        this.size = this.list.size();
    }

    @Override
    public boolean hasNext() {
        if (this.position >= this.size) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        Student student = list.get(position);
        position += 1;
        return student;
    }
}
