package controlstatement.loopstatement.forloop;

import java.util.Scanner;

public class ForLoopExample {
    public void getForLoop() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.print("i = " + i);
            System.out.println("  My Name is Khan");
            System.out.println("He name is " + name);
            System.out.println();
        }
        System.out.println();
        System.out.flush();
    }

    public void Palindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        int r, sum = 0;
        for (int i = n; i > 0; ) {
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

    public void Armstrong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        int r, sum = 0;
        for (int i = n; i > 0; ) {
            r = i % 10;
            sum = sum * 10 + r*r*r;
            i = i / 10;
        }
        if (n == sum) {
            System.out.println("It is a armstrong Number");
        } else {
            System.out.println("It is not a armstrong Number");
        }
        System.out.println();
    }
}
