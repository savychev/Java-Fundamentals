package be.intecbrussel.les2.Oefening6;

public class Oefening6_1 {
    public static void main(String[] args) {
        String str = "a";
        String str1 = "123";
        String str2 = "55.99";
        String str3 = "false";

        Character c = new Character('a');
        Integer i = new Integer(123);
        Float f = new Float(55.99);
        Boolean b = new Boolean(false);

        boolean equal1 = str.equals(c.toString()); // true
        boolean equal2 = str1.equals(i.toString()); // true
        boolean equal3 = str2.equals(f.toString()); // true
        boolean equal4 = str3.equals(b.toString()); // true
    }
}
