package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("white");
        car.doorCount = 4;
        car.setMileage(7.5);
        car.running = true;

        System.out.println(car);


//
//        double carTraveldDistance = car.accelerate(100, 2);
//
//
//
//
//        car.engine = engine;
//
//        engine = null;
//
//        Car car2 = new Car(new Engine());
//        car2.setName("sfa");

        Vehicle vehicle1 = new Vehicle();
                vehicle1.vehicleCount = 1;

        Vehicle vehicle2 = new Vehicle();
                vehicle2.vehicleCount = 2;

         Vehicle.vehicleCount = 3;

        System.out.println("Value from vehicle1; " + vehicle1.vehicleCount);
        System.out.println("Value from vehicle2; " + vehicle2.vehicleCount);
        System.out.println("Value from Vehicle class; " + Vehicle.vehicleCount);


        new AutoVehicle();

        vehicle1.accelerate(130, 0.8);

        new UFO().accelerate(130,0.8);

        // polymorphism (an object can take multiple forms)
        Vehicle ufo = new UFO();
        // The type of variables does NOT determine the object's behavior
        ufo.accelerate(200,2);

        // The type of the variable determins what methods can be invoked
        // we might need type casting (se below)
        ((UFO) ufo).concealCheating();

    }
}
