package ua.nezhura.hw4;


import java.util.concurrent.ThreadLocalRandom;


public class Task2 {
    public static void main(String[] args) {
        int[] numbers = createRandomNumArr(1000);
        System.out.println(countPrimaryNumbers(numbers));

    }

    public static int[] createRandomNumArr(int length) {
        int[] numbers = new int[length];
        fillArray(numbers);
        return numbers;
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
    }

    public static boolean isPrimary(int number) {
        if (number <= 1) {
            return false;
        }
        boolean isPrimary = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimary = false;
                break;
            }
        }
        return isPrimary;
    }

    public static int countPrimaryNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            boolean isPn = isPrimary(n);
            if (isPn == true) {
                count++;
            }
        }
        return count;
    }
}
