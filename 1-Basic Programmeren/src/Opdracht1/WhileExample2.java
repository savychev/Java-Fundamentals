package Opdracht1;

public class WhileExample2 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 50) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}