package ExamExercise.Q5;

public class Rectangle implements Shape{
    public int length, breadth;
    public void getData(){
        length = 5;
        breadth = 5;
    }
    public void displayArea(){
        System.out.println("Area of rectangle");
        System.out.println(length*breadth);
    }
}
