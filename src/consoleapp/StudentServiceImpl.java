package consoleapp;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements  StudentService{

    List<Student> sList = new ArrayList<>();

    @Override
    public void addStudent(Student s) {
        sList.add(s);
        System.out.println("===== Added Successfully =====");
    }

    @Override
    public void deleteStudent(int index) {
    sList.remove(index);
    }

    @Override
    public List<Student> getAllStudent() {
        return sList;
    }
}
