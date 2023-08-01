package interfaceExample.multipleInheritance.Vehicle;

public class Vehicle implements Bike, Cycle {
    @Override
    public void run() {
        System.out.println("Speed of Bike is 50km/hr");
    }

    @Override
    public void Speed() {
        System.out.println("Bike is running");
    }

    @Override
    public void color() {
        System.out.println("Cycle color is Black");
    }
}
