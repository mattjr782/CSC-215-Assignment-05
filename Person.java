/******************************
 *
 * File: Person.java
 * By: Matthew Rivera
 * Date: 04/03/2026
 * Description: This program is a java class for a person that can be used to create a person object.
 *
 ******************************/

import java.util.Arrays;

public class Person {
    //properties
    private String name;
    private int age, ssn;
    private int[] birthday;

    //initializer with no parameters
    public Person(){
        this.name = "N/A";
        this.age = 0;
        this.ssn = 0;
        this.birthday = new int[3];
        Arrays.fill(this.birthday, 0);
    }

    //initializer with parameters
    public Person(String name, int age, int ssn, int[] birthday){
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.birthday = birthday;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getSSN(){
        return this.ssn;
    }

    public int[] getBirthday(){
        return this.birthday;
    }
}
