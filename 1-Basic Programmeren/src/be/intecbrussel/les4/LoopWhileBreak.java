package be.intecbrussel.les4;

public class LoopWhileBreak {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;

            if (i == 4)
                break;
        }
    }
}
