package ExamExercise.Q6;

public class Airplane extends Fmachine{
    public String variablescode;
    public String namecapacity;
    @Override
    public void getData(){
        variablescode = "ABC";
        namecapacity = "ABC123";
    }
    @Override
    public void putData(){
        System.out.println(variablescode);
        System.out.println(namecapacity);
    }

    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.getData();
        airplane.putData();
    }
}
