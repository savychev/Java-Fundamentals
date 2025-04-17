package be.intecbrussel.oefening4;

import java.util.Arrays;

public class Oefening3 {
    public static void main(String[] args) {
        String[] myArr = {"Amsterdam", "Brussel", "London", "Paris", "Madrid", "Brussel", "Amsterdam"};

        for (int i = 0; i < myArr.length; i++) {
            String key = myArr[i];

            for (int m = i; m < myArr.length; m++) {
//                System.out.println(key.equals(myArr[m]));
                if (key.equals(myArr[m])){
                    System.out.println("key = " + key + " | myArr[m] = " + myArr[m]);
//                    System.out.println(myArr[m]);
                }
                else {
                    System.out.println("key = " + key);
                }
            }
        }
    }
}
