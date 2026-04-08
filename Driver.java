/******************************
 *
 * File: Driver.java
 * By: Matthew Rivera
 * Date: 04/04/2026
 * Description: This is a driver class that can be used as an object
 *
 ******************************/

public class Driver {
    //Properties
    private int age;
    private String name;

    //initializers
    public Driver(){
        age = 16; //minimum age to drive
        name = "N/A";
    }

    public Driver(int age, String name){
        this.age = age;
        this.name = name;
    }

    //getters and setters
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
