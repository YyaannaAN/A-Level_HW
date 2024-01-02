package org.example;

import java.util.Scanner;

public class HW2_Task5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        var text = sc.next();
        
        System.out.println("First way reversion");
        HW2_Task5.reverseOne(text);

        System.out.println("Second way reversion");
        HW2_Task5.reverseTwo(text);
    }

    public static void reverseOne(String text) {
        var reversed = new StringBuilder(text).reverse().toString();
        System.out.println(reversed);
    }

    public static void reverseTwo(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        System.out.println(result);
    }
}