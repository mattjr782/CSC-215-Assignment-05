/******************************
 *
 * File: Wheel.java
 * By: Matthew Rivera
 * Date: 04/04/2026
 * Description: This is a wheel class that can be used as an object
 *
 ******************************/

public class Wheel {
    //properties
    private int diameter;
    private double width;
    private String type;

    //initializers
    public Wheel(){
        diameter = 16;//average wheel
        width = 7.5;//average width
        type = "aluminum alloy wheels";//most common wheel type
    }

    public Wheel(int diameter, double width, String type){
        this.diameter = diameter;
        this.width = width;
        this.type = type;
    }

    //getters and setters
    public int getDiameter(){
        return diameter;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
}
