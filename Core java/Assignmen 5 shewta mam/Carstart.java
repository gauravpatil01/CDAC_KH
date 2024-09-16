package org.solution;

class Vehicle {
    public void startEngine() {
        System.out.println("Starting the engine of the vehicle");
    }

    public void stopEngine() {
        System.out.println("Stopping the engine of the vehicle");
    }
}

class Carr extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the car engine with a key or button");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the car engin");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle engine with a kick or button");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the motorcycle engin");
    }
}

public class Carstart {
    public static void main(String[] args) {
        Vehicle car = new Carr();
        Vehicle bike = new Motorcycle();

        car.startEngine();
        car.stopEngine();

        bike.startEngine();
        bike.stopEngine();
    }
}
