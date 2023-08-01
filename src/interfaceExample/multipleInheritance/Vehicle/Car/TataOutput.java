package interfaceExample.multipleInheritance.Vehicle.Car;

import interfaceExample.multipleInheritance.Vehicle.Car.Car;
import interfaceExample.multipleInheritance.Vehicle.Car.Tata;

public class TataOutput {
    public static void main(String[] args) {
        Tata tata = new Tata();
        tata.speed();
        tata.mileage();
        System.out.println(Car.a);
    }
}
