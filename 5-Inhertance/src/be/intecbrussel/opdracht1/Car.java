package be.intecbrussel.opdracht1;

public class Car {
    private String color;
    private int speed;
    private int hp;

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

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void accelerate(int amount) {
        int hp = getHp();

        setSpeed(amount + (hp / 100));
    }

    public void slow(int amount) {
        int hp = getHp();

        setSpeed(amount - (hp / 100));
    }

    public void park() {
        setSpeed(0);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", hp=" + hp +
                '}';
    }
}
