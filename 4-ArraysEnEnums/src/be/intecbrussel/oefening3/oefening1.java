package be.intecbrussel.oefening3;

public class oefening1 {
    public static void main(String[] args) {
        String str = "Char Array!";

        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            System.out.print(" | " + c);
        }
        System.out.print(" |");
    }
}
