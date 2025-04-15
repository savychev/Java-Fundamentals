package be.intecbrussel.oefening2;

public class Oefening3 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 25, 35, -16, 60, -100};

        int i = 0;
        double sum = 0;
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }

        double average = sum / numbers.length; // 7.714285714285714
        average = Math.floor(average);

        System.out.println(average); // 7.0
    }
}