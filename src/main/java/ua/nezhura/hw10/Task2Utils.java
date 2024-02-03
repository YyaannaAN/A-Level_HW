package ua.nezhura.hw10;

import java.util.ArrayList;
import java.util.List;

public final class Task2Utils {
    private Task2Utils() {
    }

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (int number : numbers) {
            stringList.add(Integer.toString(number));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doubledList = new ArrayList<>();
        for (String string : strings) {
            doubledList.add(string + string);
        }
        return doubledList;
    }

}