package ua.nezhura.hw10;

import java.util.ArrayList;
import java.util.List;

import static ua.nezhura.hw10.Task2Utils.*;

public class Task2Run {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        int sum = getSum(numbers);
        System.out.println("Sum: " + sum);

        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Odd numbers: " + oddNumbers);

        List<String> stringList = convertToStringList(numbers);
        System.out.println("String list: " + stringList);

        List<String> doubledList = doubling(stringList);
        System.out.println("Doubled list: " + doubledList);
    }
}

