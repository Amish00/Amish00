import javabean.Student;

public class StudentOutput {
    public static void main(String[] args) {

        Student stu = new Student();
        stu.setId(1);
        stu.setName("Virinchi");

        System.out.println("Student Id is " + stu.getId());
        System.out.println("Student Name is " + stu.getName());


    }
}
