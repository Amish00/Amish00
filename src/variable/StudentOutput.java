package variable;

public class StudentOutput {
    public static void main(String[] args) {
        Student obj = new Student();
        System.out.println("Instance Variable " + obj.number);
        System.out.println();
        System.out.println("Static variable " + Student.collegeName);
        obj.method();
    }
}
