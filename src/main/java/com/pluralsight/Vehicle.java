package com.pluralsight;

public class Vehicle {

    private String color;
    private int fuelCapacity;
    private int numberOfPassengers;
    private int cargoCapacity;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car myCar = new Car();
        myCar.setColor("Blue");
        myCar.setNumberOfPassengers(5);

        SemiTruck myTruck = new SemiTruck();
        myTruck.setColor("Green");
        myTruck.setCargoCapacity(1000);

        HoverCraft myHovercraft = new HoverCraft();
        myHovercraft.setColor("White");
    }
}
