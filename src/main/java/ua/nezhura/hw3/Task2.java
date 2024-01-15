package ua.nezhura.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = sc.nextLine();


        String result = text.replace(" ", "").toLowerCase();
        System.out.println(result);

        if (isPalindrome(result)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static boolean isPalindrome(String text) {
        int length = text.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
            char forwardChar = text.charAt(forward++);
            char backwardChar = text.charAt(backward--);
            if (forwardChar != backwardChar)
                return false;
        }
        return true;
    }
}
