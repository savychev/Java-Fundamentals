package be.intecbrussel.les3.Oefening1.Oefening1_3;

import org.w3c.dom.ls.LSOutput;

public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.addition(3,7));
        System.out.println(calculator.substraction(100,3));
        System.out.println(calculator.multiplication(3,8));
        System.out.println(calculator.division(100,4));
        System.out.println(calculator.modulus(100,3));

    }
}
