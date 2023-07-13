package Abstraction;

public abstract class Bank {
    public Bank(){
        System.out.println("This is Bank constructor");
    }

    public abstract double getRateOfInterest();

    public void display(){
        System.out.println("This is display");
    }

    public static void getBankName(){
        System.out.println("This is Head bank");
    }
}
