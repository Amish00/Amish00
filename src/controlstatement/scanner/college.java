package controlstatement.scanner;

import java.util.Scanner;

public class college {
    Scanner sc = new Scanner(System.in);

    public void getStudentGrade() {
        System.out.println("Enter Math Marks: ");
        int mathMarks = sc.nextInt();
        System.out.println("Enter Science Marks: ");
        int scienceMarks = sc.nextInt();

        if (mathMarks >= 80 && scienceMarks >= 80) {
            System.out.println("You have got Distinction.. ");
        } else if (mathMarks >= 60 && scienceMarks >= 60) {
            System.out.println("You have got First Division.. ");
        } else if (mathMarks >= 35 && scienceMarks >= 35) {
            System.out.println("You have passed.. ");
        } else {
            System.out.println("You have failed..");
        }
    }
}
