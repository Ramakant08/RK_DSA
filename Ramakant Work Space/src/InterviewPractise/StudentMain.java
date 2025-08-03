package InterviewPractise;

public class StudentMain {
    public static void main(String[] args) {
        Student student=new Student.StudentBuilder().setStandard(1).setSection('a').setName("Raghav").setrollNumber(26).builde();
        System.out.println(student);
    }
}



