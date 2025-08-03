package InterviewPractise;

public class Student {
    String name;
    int standard;
    char section;
    int roll_number;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.section = studentBuilder.section;
        this.roll_number = studentBuilder.roll_number;
        this.standard = studentBuilder.standard;
    }

    public String getName() {
        return name;
    }

    public int getStandard() {
        return standard;
    }

    public char getSection() {
        return section;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public static class StudentBuilder {
        String name;
        int standard;
        char section;
        int roll_number;

        public StudentBuilder() {

        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setStandard(int standard) {
            this.standard = standard;
            return this;
        }

        public StudentBuilder setSection(char section) {
            this.section = section;
            return this;
        }

        public StudentBuilder setrollNumber(int rollNumber) {
            this.roll_number = rollNumber;
            return this;
        }

        public Student builde() {
            Student student = new Student(this);
            return student;
        }
    }
}
