package org.example;

public class HW2_Task3 {
    public static void main(String[] args) {
        isEven(2);
        isEven(3);
        isEven(4);
    }

    public static void isEven(int number) {
        if (number % 2 == 0)
            System.out.println(number + " is an even number.");
        else
            System.out.println(number + " is an odd number.");


    }
}
