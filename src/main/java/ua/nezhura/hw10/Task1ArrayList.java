package ua.nezhura.hw10;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1ArrayList {
    private static void runForLoop(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String item = list.get(i);
            System.out.println(item);
        }
    }

    private static void runForEachLoop(List<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    private static void runWhileLoop(List<String> list) {
        int index = 0;
        while (index < list.size()) {
            String item = list.get(index);
            System.out.println(item);
            index++;
        }
    }

    private static void runIterator(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");

        System.out.println("for:");
        runForLoop(list);
        System.out.println();
        System.out.println("for-each:");
        runForEachLoop(list);
        System.out.println();
        System.out.println("while:");
        runWhileLoop(list);
        System.out.println();
        System.out.println("iterator:");
        runIterator(list);

    }
}
