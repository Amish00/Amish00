package controlstatement.ifelse;

public class Collage {
    public void getMarks(){
        int mathmarks = 50;
        int sciencemarks = 60;

        if (mathmarks>50 && sciencemarks>50){
            System.out.println("You have got an A");
        } else if(mathmarks>40 && sciencemarks>40){
            System.out.println("You have PASS...");
        } else{
            System.out.println("You have Fail...");
        }
    }

    public void getSwitchMarks(){
        int Computermark =40;
        switch (Computermark){
            case 20:
                System.out.println("Fail...");
                break;
            case 40:
                    System.out.println("Pass...");
                    break;
            case 60:
                System.out.println("A");
                break;
            default:
                System.out.println("Absent");
        }
    }
}
