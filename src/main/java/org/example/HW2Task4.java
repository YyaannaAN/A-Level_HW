package org.example;

public class HW2Task4 {
    public static void main(String[] args) {
        System.out.println(getAbsMin(-1, 5, -7));
        System.out.println(getAbsMin(1, 5, -7));
        System.out.println(getAbsMin(4, 8, -3));
    }

    public static int getAbsMin(int a, int b, int c) {
        var firstLowest = Math.abs(a) < Math.abs(b) ? a : b;
        return Math.abs(firstLowest) < Math.abs(c) ? firstLowest : c;
    }
}
