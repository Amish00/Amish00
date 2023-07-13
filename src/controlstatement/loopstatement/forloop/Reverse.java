package controlstatement.loopstatement.forloop;

public class Reverse {
    public static void main(String[] args) {
        String name = "Computer", rev = "";
        for(int i = name.length()-1; i>=0; i--){
            rev+= name.charAt(i);
        }
        System.out.println("Original name = " + name);
        System.out.println("Reverse name = " + rev);

    }
}
