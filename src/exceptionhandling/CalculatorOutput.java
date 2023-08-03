package exceptionhandling;

public class CalculatorOutput {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.getNumber();
        obj.Example();

        try{
            obj.displayAge(18);
        } catch (ArithmeticException e){
            System.out.println("Age is less than 20");
        }
    }
}
