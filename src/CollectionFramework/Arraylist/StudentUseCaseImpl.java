package CollectionFramework.Arraylist;

import java.util.ArrayList;

public class StudentUseCaseImpl {
    public  void displayStudentInfo(){
        ArrayList<Student> arrayList = new ArrayList<>();

        Student student = new Student();
        student.setId(111);
        student.setName("Virinchi");

        Student student1 = new Student();
        student1.setId(211);
        student1.setName("Vinchi");

        arrayList.add(student);
        arrayList.add(student1);

        System.out.println(arrayList.toString());
    }
}
