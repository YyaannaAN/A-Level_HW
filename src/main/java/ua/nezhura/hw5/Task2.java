package ua.nezhura.hw5;

import java.util.Arrays;


public class Task2 {

    public static void main(String[] args) {
        int[] orderedNumbers = {97, 78, 67, 45, 24};
        int[] unOrderedNumbers = {56, 2, 98, 34, 17};
        //fill(numbers);
        System.out.println("ordered numbers before: " + Arrays.toString(orderedNumbers));
        System.out.println("unordered numbers before: " + Arrays.toString(unOrderedNumbers));

        System.out.println("ordered numbers is descendant: " + isdDescendant(orderedNumbers));
        System.out.println("unordered numbers is descendant: " + isdDescendant(unOrderedNumbers));

        System.out.println("ordered numbers after: " + Arrays.toString(orderedNumbers));
        System.out.println("unordered numbers after: " + Arrays.toString(unOrderedNumbers));

    }

    public static boolean isdDescendant(int[] numbers) {
        if ((numbers.length == 0) || (numbers.length == 1)) {
            return true;
        } else {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] <= numbers[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
