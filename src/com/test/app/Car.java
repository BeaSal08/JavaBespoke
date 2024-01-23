package com.test.app;

private class Car {
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
    }
}
