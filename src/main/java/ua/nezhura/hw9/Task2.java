package ua.nezhura.hw9;

public class Task2 {
    private void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception("Caught exception in f(), exception: " + e.getMessage());
        }
    }

    private void g() throws Exception {
        throw new Exception("Throw exception in g()");
    }


    public static void main(String[] args) {
        Task2 example = new Task2();
        try {
            example.f();
        } catch (Exception e) {
            System.out.println("Caught exception in main(): " + e.getMessage());
        }
    }
}

