/******************************
 *
 * File: OOP_ClassRelationship_Has_A_MatthewRivera.java
 * By: Matthew Rivera
 * Date: 04/04/2026
 * Description: This program runs the other five files using a has a relation
 *
 ******************************/

import java.util.Scanner;

public class OOP_ClassRelationship_Has_A_MatthewRivera {

    public static void main(String[] args){
        printCar(createCar());
    }

    public static Car createCar(){
        Scanner in = new Scanner(System.in);
        Car returnCar = new Car();

        System.out.print("Please enter the cars horsepower (int), number of cylinders (int)," +
                " and the fuel type (String): ");
        returnCar.setEngine(in.nextInt(), in.nextInt(), in.next());

        System.out.print("Please enter the age (int) and name (String) of the driver: ");
        returnCar.setDriver(in.nextInt(), in.next());

        System.out.print("Please enter the diameter (int), width (double), and type of wheel (String): ");
        returnCar.setWheel(in.nextInt(), in.nextDouble(), in.next());

        return returnCar;
    }

    public static void printCar(Car car){
        System.out.println("\n\n");
        System.out.println("data of the car:");
        System.out.printf("%4sEngine:\n", "");
        System.out.printf("%8s%-30s%d\n", "", "HorsePower:", car.getEngine().getHorsepower());
        System.out.printf("%8s%-30s%d\n", "", "Number of Cylinders:", car.getEngine().getCylinders());
        System.out.printf("%8s%-30s%s\n\n", "", "Fuel type:", car.getEngine().getFuelType());
        System.out.printf("%4sDriver:\n", "");
        System.out.printf("%8s%-30s%d:\n", "", "Age:", car.getDriver().getAge());
        System.out.printf("%8s%-30s%s:\n\n", "", "Name:", car.getDriver().getName());
        System.out.printf("%4sWheel:\n", "");
        System.out.printf("%8s%-30s%d\n", "", "Diameter:", car.getWheel().getDiameter());System.out.printf("%8s%-30s%f\n", "", "Width:", car.getWheel().getWidth());
        System.out.printf("%8s%-30s%s\n", "", "Wheel Type:", car.getWheel().getType());
    }

}
