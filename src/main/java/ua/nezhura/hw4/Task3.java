package ua.nezhura.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = createRandomNumArr(2000);
        System.out.println("initial array " + Arrays.toString(numbers));
        System.out.println("copied array " + Arrays.toString(evenNumbersReplace(numbers)));
        System.out.println("initial array after copy " + Arrays.toString(numbers));
    }

    public static int[] createRandomNumArr(int length) {
        int[] numbers = new int[length];
        fillArray(numbers);
        return numbers;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 1000);
        }
    }

    public static int[] evenNumbersReplace(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] % 2 == 0) {
                copy[i] = 0;

            }
        }
        return copy;
    }
}
