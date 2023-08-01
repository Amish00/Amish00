package ExamExercise.Q4;

public class Test extends Student{
    public int mark1, mark2;
    public void readmarks (int mark1, int mark2){
        this.mark1=mark1;
        this.mark2=mark2;
    }
    public void displaymarks (){
        System.out.println(mark1);
        System.out.println(mark2);
    }
}
