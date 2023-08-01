package ExamExercise.Q5;

public class Square implements Shape{
    public  int length;
    public void getData(){
        length = 4;
    }
    public  void displayArea(){
        System.out.println("Area of Square");
        System.out.println(length*length);
    }
}
