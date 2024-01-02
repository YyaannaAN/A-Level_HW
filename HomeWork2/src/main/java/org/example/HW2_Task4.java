package org.example;

public class HW2_Task4 {
    public static void main(String[] args) {
        System.out.println(HW2_Task4.getAbsMin(-1, 5, -7));
        System.out.println(HW2_Task4.getAbsMin(1, 5, -7));
        System.out.println(HW2_Task4.getAbsMin(4, 8, -3));
    }

    public static int getAbsMin(int a, int b, int c) {
        var firstLowest = Math.abs(a) < Math.abs(b) ? a : b;
        return Math.abs(firstLowest) < Math.abs(c) ? firstLowest : c;
    }
}
