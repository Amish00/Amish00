package ExamExercise.Q2;

public class Rectangle {
    int length, breadth;

    public int computeArea() {
        return length * breadth;
    }

    public void displayArea() {
        System.out.println("The area of the rectangle is " + computeArea());
    }
}

