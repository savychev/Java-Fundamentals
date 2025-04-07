package be.intecbrussel.Car;

import java.util.Random;

public class Car {
    private String color;
    private int speed;
    private int power;

    private final String defaultColor = "white";
    private final int defaultSpeed = 120;
    private final int defaultPower = 150;

    private int currentSpeed;

    public Car() {
        setColor(this.defaultColor);
        setSpeed(this.defaultSpeed);
        setPower(this.defaultPower);
    }

    public Car(String color) {
        setColor(color);
        setSpeed(this.defaultSpeed);
        setPower(this.defaultPower);
    }

    public Car(String color, int speed) {
        setColor(color);
        setSpeed(speed);
        setPower(this.defaultPower);
    }

    public Car(String color, int speed, int power) {
        setColor(color);
        setSpeed(speed);
        setPower(power);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void speedUp() {
        this.currentSpeed += 5;
    }

    public void slowDown() {
        this.currentSpeed -= 5;
    }

    public void repaint(String newColor) {
        setColor(newColor);
    }

    public void repair() {
        Random random = new Random();
        int min = 299;
        int max = 300;
        int randomNumber = random.nextInt(min, max);
        System.out.println("Repair costs "+randomNumber+" euros.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", currentSpeed=" + currentSpeed +
                '}';
    }
}
