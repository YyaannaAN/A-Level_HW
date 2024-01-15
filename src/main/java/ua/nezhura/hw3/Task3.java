package ua.nezhura.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = sc.nextLine();
        int result = countWords(text);
        System.out.println(result);
    }

    public static int countWords(String text) {
        return text.trim().split("\\s+").length;
    }
}
