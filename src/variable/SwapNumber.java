package variable;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("a = " + a + " and b = " + b);
        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println("a = " + a + " and b = " + b);

    }
}
