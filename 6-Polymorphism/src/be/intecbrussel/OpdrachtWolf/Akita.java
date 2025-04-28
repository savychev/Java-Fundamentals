package be.intecbrussel.OpdrachtWolf;

public class Akita extends HomelyDog {
    private char gender;
    private char size;

    public void setGender(char gender) {
        this.gender = gender;

        if (gender == 'F') {
            this.size = 'M';
        } else if (gender == 'M') {
            this.size = 'L';
        }
    }

    public void layDown() {
    }

    public void dance() {
    }

    public void sing() {
    }

    @Override
    public void sit() {
        System.out.println("Akita refuses to sit.");
    }
}
