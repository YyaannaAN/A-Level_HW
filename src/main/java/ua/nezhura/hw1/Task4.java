package ua.nezhura.hw1;

public class Task4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("before swapping\n" + "a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swapping\n" + "a = " + a);
        System.out.println("b = " + b);
    }
}
