import java.util.Arrays;


public class Test {
    public static int howMany(boolean b, boolean... b2) {
        System.out.println("b2 = " + Arrays.toString(b2));
        return b2.length;
    }

    public static void main(String[] args) {
        System.out.println("C: " + howMany(true, true));
        System.out.println("D: " + howMany(true, true, true));
        System.out.println("G: " + howMany(true, new boolean[2]));
    }
}

