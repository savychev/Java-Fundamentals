package be.intecbrussel.les3.Oefening1.Oefening1_1;

public class MainMinFinder {
    public static void main(String[] args) {
        MinFinder minFinder = new MinFinder(5, 3, 4);

        int result = minFinder.getMin();
        System.out.println(result);
    }
}
