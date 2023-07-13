package Polymorphism;

public class AddOutput {
    public static void main(String[] args) {
        Add addition= new Add();
        System.out.println(addition.getSum());
        System.out.println(addition.getSum(1));
        System.out.println(addition.getSum(1,3));
        System.out.println(addition.getSum(5.5,6.5));
        System.out.println(addition.getSum(5,6.5));

    }
}
