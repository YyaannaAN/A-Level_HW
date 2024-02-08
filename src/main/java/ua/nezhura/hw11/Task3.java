package ua.nezhura.hw11;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        long time1 = countTimeForAddElementsToArrayList();
        System.out.println("Time taken to add elements to ArrayList: " + time1 + " ms");

        long time2 = countTimeForAddElementsToLinkedList();
        System.out.println("Time taken to add elements to LinkedList: " + time2 + " ms");

        long time3 = countTimeForGetRandomElementsFromArrayList();
        System.out.println("Time taken to get random elements from ArrayList: " + time3 + " ms");

        long time4 = countTimeForGetRandomElementsFromLinkedList();
        System.out.println("Time taken to get random elements from LinkedList: " + time4 + " ms");

    }

    public static long countTimeForAddElementsToArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public static long countTimeForAddElementsToLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public static long countTimeForGetRandomElementsFromArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(arrayList.size());
            arrayList.get(randomIndex);
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public static long countTimeForGetRandomElementsFromLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(linkedList.size());
            linkedList.get(randomIndex);
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }
}
