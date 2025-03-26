package com.topics.coupling;

class Engine {
    public void startEngine() {
        System.out.println("!!Engine is starting!!");
    }
}

class PetrolEngine {
    public void startPetrolEngine() {
        System.out.println("!!Petrol Engine is starting!!");
    }
}

class ElectricEngine {
    public void startElectricEngine() {
        System.out.println("!!Electric Engine is starting!!");
    }
}

class Car {

    // private Engine engine;
    // private PetrolEngine petrolEngine;
    // private ElectricEngine electricEngine;

    // public Car() {
    // engine = new Engine(); // Engine Object is directly created
    // petrolEngine = new PetrolEngine();
    // electricEngine = new ElectricEngine();
    // }

    // public void startCar() {
    // // engine.startEngine();
    // petrolEngine.startPetrolEngine();
    // // electricEngine.startElectricEngine();
    // System.out.println("Car is moving forward |->|->|->|->|->");
    // }

}

public class TightCoupling {
    public static void main(String[] args) {
        System.out.println();
        Car car = new Car();
        // car.startCar();
        System.out.println();

    }
}
