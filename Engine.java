/******************************
 *
 * File: Engine.java
 * By: Matthew Rivera
 * Date: 04/04/2026
 * Description: This is the engine class that can be used as an object
 *
 ******************************/

public class Engine {
    //properties
    private int horsepower, cylinders;
    private String fuelType;

    //initializers

    public Engine(){
        horsepower = 252;//average horsepower
        cylinders = 4;//most common number of cylinders
        String fuelType = "regular unleaded";//most common used type
    }

    public Engine(int horsepower, int cylinders, String fuelType){
        this.horsepower = horsepower;
        this.cylinders = cylinders;
        this.fuelType = fuelType;
    }


    //getters and setters
    public int getHorsepower(){
        return horsepower;
    }

    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }

    public int getCylinders(){
        return cylinders;
    }

    public void setCylinders(int cylinders){
        this.cylinders = cylinders;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
}
