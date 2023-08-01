package interfaceExample;

public class NumOutput {
    public static void main(String[] args) {
        Calculation cal = new Calculation();

        System.out.println( "the difference is " + cal.diff(5,5));
        System.out.println("the sum is " + cal.add(5,4));
    }
}
