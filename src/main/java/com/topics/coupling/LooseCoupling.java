package com.topics.coupling;

interface Engine {
    public void startEngine();
}

class PetrolEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("!!Petrol Engine is starting!!");
    }
}

class ElectricEngine implements Engine {
    @Override
    public void startEngine() {
        System.out.println("!!Electric Engine is starting!!");
    }
}

class Car {
    private Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine; // Passing Engine Object during calling time

    }

    public void startCar() {
        engine.startEngine();
        System.out.println("Car is moving forward |->|->|->|->|->");
    }

}

public class LooseCoupling {
    public static void main(String[] args) {

        ElectricEngine electricEngine = new ElectricEngine();
        Car car = new Car(electricEngine);
        car.startCar();
    }
}
