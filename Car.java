/******************************
 *
 * File: Car.java
 * By: Matthew Rivera
 * Date: 04/04/2026
 * Description: This is a car class that can be used for an object
 *
 ******************************/

public class Car {
    //properties
    private Engine engine;
    private Driver driver;
    private Wheel wheel;

    //initializers
    public Car(){
        engine = new Engine();
        driver = new Driver();
        wheel = new Wheel();
    }

    public Car(Engine engine, Driver driver, Wheel wheel){
        this.engine = engine;
        this.driver = driver;
        this.wheel = wheel;
    }

    public Car(int horsePower, int cylinders, String fuelType, int age, String name, int diameter,
               double width, String type){
        this.engine = new Engine(horsePower, cylinders, fuelType);
        this.driver = new Driver(age, name);
        this.wheel = new Wheel(diameter, width, type);
    }

    //getters and setters
    public Engine getEngine(){
        return engine;
    }

    public void setEngine(Engine engine){
        this.engine = engine;
    }

    public void setEngine(int horsePower, int cylinders, String fuelType){
        engine.setHorsepower(horsePower);
        engine.setCylinders(cylinders);
        engine.setFuelType(fuelType);
    }

    public Driver getDriver(){
        return driver;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public void setDriver(int age, String name){
        driver.setAge(age);
        driver.setName(name);
    }

    public Wheel getWheel(){
        return wheel;
    }

    public void setWheel(Wheel wheel){
        this.wheel = wheel;
    }

    public void setWheel(int diameter, double width, String type){
        wheel.setDiameter(diameter);
        wheel.setWidth(width);
        wheel.setType(type);
    }
}
