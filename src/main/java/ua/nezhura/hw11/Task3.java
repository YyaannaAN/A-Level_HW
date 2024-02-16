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

    public static void fillArray(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    public static long countTimeForAddElementsToArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        return countTimeForAddElementsToList(arrayList);
    }

    public static long countTimeForAddElementsToLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        return countTimeForAddElementsToList(linkedList);
    }

    public static long countTimeForAddElementsToList(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        fillArray(list);
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public static long countTimeForGetRandomElementsFromArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        return countTimeForGetElementFromList(arrayList);
    }

    public static long countTimeForGetRandomElementsFromLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        return countTimeForGetElementFromList(linkedList);
    }

    public static long countTimeForGetElementFromList(List<Integer> list) {
        fillArray(list);
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = random.nextInt(list.size());
            list.get(randomIndex);
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }
}
