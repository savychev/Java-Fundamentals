package be.intecbrussel.les3.Oefening1.Oefening1_1;

// Schrijf een methode die het kleinste nummer van 3 nummers kan vinden.
public class MinFinder {
    int first;
    int second;
    int third;
    int min;

    public MinFinder() {
    }

    public MinFinder(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getthird() {
        return third;
    }

    public void setThird(int third) {
        this.third = third;
    }

    public int getMin() {
        if (this.first < this.second && this.first < this.third)
            min = this.first;
        else if (this.second < this.first && this.first < this.third)
            min = this.second;
        else
            min = this.third;

        return min;
    }
}
