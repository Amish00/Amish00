package superkeyword;

public class Animals {
    String name = "Virinchi";

    public void getName() {
        System.out.println("This is Animal class.");
    }
}
  class HumanBeing extends Animals{
    String name = "your name";
    public void getName(){
        System.out.println(super.name);
        System.out.println(name);
        super.getName();
    }
 }

