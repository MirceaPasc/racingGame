package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {   Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        Car car = new Car(engine);
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        double carTraveldDistance = car.accelerate(100, 2);




        car.engine = engine;

        engine = null;

        Car car2 = new Car(new Engine());
        car2.name = "sfa";

    }
}
