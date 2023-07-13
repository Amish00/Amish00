package Abstraction;

public class HimalayanBankOutput {
    public static void main(String[] args) {
        HimalayanBank himalayanBank = new HimalayanBank();
        System.out.println("Interest Rate for Himalayan Bank is : " + himalayanBank.getRateOfInterest()); // Abstract method
        himalayanBank.display();// Non-Abstract method
        Bank.getBankName();//static method
    }
}
