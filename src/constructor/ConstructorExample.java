package constructor;

public class ConstructorExample {
    public ConstructorExample(){
        System.out.println("Non parameterized constructor...");
    }

    public ConstructorExample(String name){
        System.out.println(" parameterized constructor");
    }

    public void getName(){
        System.out.println("Virinchi");
    }
    public void getName(String name){
        System.out.println("Virinchi2");
    }
    public static void main(String[] args) {

        ConstructorExample e1 = new ConstructorExample();
        ConstructorExample e2 = new ConstructorExample("Ram");
        e1.getName();
        e1.getName("Sita");
        e2.getName();
    }
}
