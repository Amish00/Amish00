package exceptionhandling;

public class Calculator {
    public void getNumber() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try {
            System.out.println(100 / 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Occurred");
        } finally {
            System.out.println("This is Finally Block");
        }
        System.out.println("5");
    }

    public void Example() {
        int i = 50;
        int j = 0;
        int data;
        try {
            data = i / j;
        } catch (Exception e) {
            System.out.println(i / (j + 2));
        }
    }
}

