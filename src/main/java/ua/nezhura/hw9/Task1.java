package ua.nezhura.hw9;

public class Task1 {
    public static void main(String[] args) {
        try {
            throw new Exception("This is an exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}

