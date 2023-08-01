package ExamExercise.Q4;

public class Outpput {
    public static void main(String[] args) {
        Result res = new Result();
        res.readrollno(1);
        res.displayrollno();
        res.readmarks(50,50);
        res.displaymarks();
        res.Calculate();
        res.displaytotal();
    }
}
