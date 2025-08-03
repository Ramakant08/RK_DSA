package DesignPattern.BuilderPatter;

/**
 *This design pattern is helpful when we want to create object of the classses but that class has too many variables to initialis
 * at the time of creating object. So at the time of creating object it will be difficult to remeber the order also it will be very diificult
 * to initialise that many varables
 *
 * To mitigate such a problem we have builder design pattern
 */
public class  Student {
    String name;
    String mailId;
    int studentId;
    int roll_no;

    public Student(StudentBuilder studentBuilder) {
        this.roll_no = studentBuilder.roll_no;
        this.name = studentBuilder.name;
        this.mailId = studentBuilder.mailId;
        this.studentId = studentBuilder.studentId;
    }

    public String getName() {
        return name;
    }

    public String getMailId() {
        return mailId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getRoll_no() {
        return roll_no;
    }

    @Override
    public String toString() {
        return "{" + studentId + ", " + name + ", " + mailId + ", " + roll_no + "}";
    }

   public static class StudentBuilder {
        String name;
        String mailId;
        int studentId;
        int roll_no;

        public StudentBuilder() {

        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setMailId(String mailId) {
            this.mailId = mailId;
            return this;
        }

        public StudentBuilder setStudentId(int studentId) {
            this.studentId = studentId;
            return this;
        }

        public StudentBuilder setRoll_no(int roll_no) {
            this.roll_no = roll_no;
            return this;
        }

        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }

}
