package controlstatement.loopstatement.DoWhileLoop;

import java.util.Scanner;

public class DOWhileLoopExample {
        public static void main(String[] args) {
            int p=1;
            do{
                System.out.println(p);
                p++;
            }while(p<=10);

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter any Number: ");
                int n = sc.nextInt();
                int r, sum = 0;
                int i = n;
                do{
                    r = i % 10;
                    sum = sum * 10 + r*r*r;
                    i = i / 10;
                }while(i>0);
                if (n == sum) {
                    System.out.println("It is a armstrong Number");
                } else {
                    System.out.println("It is not a armstrong Number");
                }
                System.out.println();

        }
    }

