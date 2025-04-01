package be.intecbrussel.les3.Animal;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.age = 1;
        cat.name = "Dimitri";
        System.out.println(cat.toString());
        cat.eating();
        cat.eating("meat");

        Animal dog = new Animal("Betchoven", 6);
        System.out.println(dog.toString());
        dog.eating();
        dog.eating("apple");

        Animal cat1 = new Animal("Salvador", 0);
        System.out.println(cat1.toString());
        cat1.eating();
        cat1.eating("chips");
    }
}
