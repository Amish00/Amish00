package interfaceExample.multipleInheritance.Vehicle.Car;

import interfaceExample.multipleInheritance.Vehicle.Car.Car;

public class Tata implements Car {
    @Override
    public void speed(){
        System.out.println("Speed of car is 55km/hr");

    }
    @Override
    public void mileage(){
        System.out.println("Mileage of car is 60km/ltr");
    }
}
