package DesignPattern.BuilderPatter;

public class BuilderMain {
    public static void main(String[] args) {
        Student student= new Student.StudentBuilder().setStudentId(54321).setRoll_no(65432).setMailId("76543").setName("mnbvc").build();
        System.out.println(student);

    }
}
