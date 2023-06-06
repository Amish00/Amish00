package Typecasting;

public class TypecastingDemo {
    int a = 5;

    public void wideningCasting() {
        int a = 5;
        long c = 987654321;
        System.out.println("Before Casting ::: " + a + " and " + c);
        float b = a;
        double d = c;
        System.out.println("After Casting ::: " + b + " and " + d);
    }

    public void narrowingCasting() {
        float f = 5.2f;
        long i = 9855;
        System.out.println("Before Casting ::: " + f + " and " + i);
        int b = (int)f;
        short j = (short)i;
        System.out.println("After Casting ::: " + b + " and " + j);
    }
}
