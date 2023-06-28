package exceptionhandling;

public class Calculator {
    public void getNumber(){
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try {
            System.out.println(100/0);
        }catch (Exception e){
            System.out.println("Error Occurred");
        }
        System.out.println("5");
    }
}
