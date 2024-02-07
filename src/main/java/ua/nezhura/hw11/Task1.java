package ua.nezhura.hw11;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static Map<String, Integer> countLetters(List<String> strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String str : strings) {
            resultMap.put(str, str.length());
        }
        return resultMap;
    }


    public static void main(String[] args) {
        List<String> strings = Arrays.asList("tree", "lesson", "and");
        Map<String, Integer> result = countLetters(strings);
        System.out.println(result);
    }
}

