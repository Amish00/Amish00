package statickeyword;

import java.util.Scanner;

public class StaticOutput {
    public static void main(String[] args) {
        System.out.println("Area of Cube = " + StaticExample.getAreaOfCube(5));
        System.out.println();
        System.out.println("Enter p, t, r");
//        System.out.println("Enter principal");
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
//        System.out.println("Enter time");
        float t = sc.nextFloat();
//        System.out.println("Enter rate");
        float r = sc.nextFloat();

        System.out.println(StaticExample.getInterest(p,t,r));
    }
}

