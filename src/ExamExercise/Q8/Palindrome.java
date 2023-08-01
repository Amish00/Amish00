package ExamExercise.Q8;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i = 0, temp = num, sum = 0, n = 0;
        while (num != 0) {
            n = num % 10;
            sum = sum * 10 + n;
            num = num / 10;
        }
        if (temp == num) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
