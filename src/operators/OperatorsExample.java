package operators;

public class OperatorsExample {
    int firstNumber = 20;
    int secondNumber = 10;


    public void getArthmeticOperator(){
        System.out.println("Addition of " + firstNumber + " and " + secondNumber + " is " + (firstNumber+secondNumber));
        System.out.println("Subtraction of " + firstNumber + " and " + secondNumber + " is " + (firstNumber-secondNumber));
        System.out.println("Multiplication of " + firstNumber + " and " + secondNumber + " is " + (firstNumber*secondNumber));
        System.out.println("Division of " + firstNumber + " and " + secondNumber + " is " + (firstNumber/secondNumber));
        System.out.println("Module of " + firstNumber + " and " + secondNumber + " is " + (firstNumber%secondNumber));
        System.out.println();
        System.out.println("Or of " + firstNumber + " and " + secondNumber + " is " + (firstNumber|secondNumber));
        System.out.println("And of " + firstNumber + " and " + secondNumber + " is " + (firstNumber&secondNumber));
    }
}
