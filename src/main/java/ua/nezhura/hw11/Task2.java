package ua.nezhura.hw11;

import java.util.*;

public class Task2 {
    public static Map<Integer, List<String>> groupByLength(List<String> strings) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for (String str : strings) {
            int length = str.length();
            if (resultMap.containsKey(length)) {
                resultMap.get(length).add(str);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                resultMap.put(length, newList);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("тут", "там", "стол");
        Map<Integer, List<String>> result = groupByLength(strings);
        System.out.println(result);
    }
}
