package ua.nezhura.hw8;

interface Pow {
    int pow(int number, int pow);
}

public class Task2 {
    public static void main(String[] args) {
        Pow powFunc = (number, pow) -> {
            int result = 1;
            for (int i = 0; i < pow; i++) {
                result *= number;
            }
            return result;
        };

        int number = 2;
        int power = 3;
        int result = powFunc.pow(number, power);
        System.out.println(number + "^" + power + "=" + result);
    }
}



