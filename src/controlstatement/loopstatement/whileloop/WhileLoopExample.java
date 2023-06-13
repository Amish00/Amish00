package controlstatement.loopstatement.whileloop;

import java.util.Scanner;

public class WhileLoopExample {
    public void getWhileLoop(){
        int i = 0;
        while(i<=10){
            System.out.println("The multiplication of 5 * " + i + " is " + i * 5);
            i++;
        }
        System.out.println();
    }

    public void Palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        int r, sum = 0, i = n;
        while (i>0){
            r = i % 10;
            sum = sum * 10 + r;
            i = i / 10;
        }
        if (n == sum) {
            System.out.println("It is a palindrome Number");
        } else {
            System.out.println("It is not a palindrome Number");
        }
        System.out.println();
        System.out.flush();
    }
}
