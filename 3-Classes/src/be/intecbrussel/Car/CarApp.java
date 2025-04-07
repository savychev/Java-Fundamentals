package be.intecbrussel.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("purple");
        System.out.println(car1);
        car1.speedUp();
        car1.speedUp();
        car1.speedUp();
        System.out.println(car1);
        car1.repair();

        Car car2 = new Car("green", 70);
        System.out.println(car2);

        Car car3 = new Car("yellow", 160, 200);
        System.out.println(car3);
    }
}
