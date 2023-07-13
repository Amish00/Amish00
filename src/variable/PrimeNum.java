package variable;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number");
        int num = sc.nextInt();
        int a = num/2, temp = 0;
        for (int i = 2; i <= a; i++){
            if (a % i == 0){
                temp = temp + 1;
            }
        }
        if (temp>1) {
            System.out.println("It is not a prime number");
        }else {
                System.out.println("It is a prime number");
            }

    }
}
