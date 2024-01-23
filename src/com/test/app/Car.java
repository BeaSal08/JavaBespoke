package com.test.app;

public class Car {
    private String name;
    private int yearOfMake;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfMake() {
        return yearOfMake;
    }

    public void setYearOfMake(int yearOfMake) {
        this.yearOfMake = yearOfMake;
    }

    // constructor (parameterized)
    public Car(String name, int yearOfMake) {
        // initialized parameters:
        this.name = name;
        this.yearOfMake = yearOfMake;

        // runs at 1st use lang
        if (yearOfMake < 2000) {
            System.out.println("Car is very old");
        }
        else {
            System.out.println("Car is new");
        }
    }
}
