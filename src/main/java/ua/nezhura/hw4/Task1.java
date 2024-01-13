package ua.nezhura.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = createRandomNumArr(400);
        System.out.println("Average " + average(numbers));
        System.out.println("Geometric Mean " + gMean(numbers));
    }

    public static int[] createRandomNumArr(int length) {
        int[] numbers = new int[length];
        fillArray(numbers);
        return numbers;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 11);
        }
    }

    public static double average(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

    public static float gMean(int[] array) {
        double result = 1;
        for (int i = 0; i < array.length; i++) {
            result = array[i] * result;
        }
        float gm = (float) Math.pow(result, (float) 1 / array.length);
        return gm;
    }


}

