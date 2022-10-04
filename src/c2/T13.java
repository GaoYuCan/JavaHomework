package c2;

public class T13 {
}

abstract class Vehicle {
    private double maxSpeed;

    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void move();

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

class Car extends Vehicle {

    public Car() {
        super(220);
    }

    @Override
    void move() {
        System.out.println("Car moving！");
    }
}