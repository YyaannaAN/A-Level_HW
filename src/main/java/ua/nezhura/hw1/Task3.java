package ua.nezhura.hw1;

public class Task3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println("before swapping\n" + "a = " + a);
        System.out.println("b = " + b);

        int x = a;
        a = b;
        b = x;
        System.out.println("after swapping\n" + "a = " + a);
        System.out.println("b = " + b);

    }
}
