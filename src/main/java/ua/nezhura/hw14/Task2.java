package ua.nezhura.hw14;

import ua.nezhura.hw4.Task3;

import java.util.concurrent.atomic.AtomicInteger;

public class Task2 {

    public static void main(String[] args) {
        int[] numbers = Task3.createRandomNumArr(50);
        AtomicInteger totalPrimeCount = new AtomicInteger(0);
        Thread thread1 = createThread(1, 0, numbers.length / 2, numbers, totalPrimeCount);
        Thread thread2 = createThread(2, numbers.length / 2, numbers.length, numbers, totalPrimeCount);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total prime count: " + totalPrimeCount.get());
    }

    public static Thread createThread(int threadNumber, int start, int end, int[] numbers, AtomicInteger totalPrimeCount) {

        return new Thread(() -> {
            int primeCountThread = countPrimes(numbers, start, end);
            System.out.println("Thread " + threadNumber + " found " + primeCountThread + " prime numbers");
            totalPrimeCount.addAndGet(primeCountThread);
        });
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (isPrime(numbers[i])) {
                count++;
            }
        }
        return count;
    }

}