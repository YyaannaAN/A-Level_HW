package ua.nezhura;

public class Practice {

    // найти максимальное значение в двухмерном массиве


    public static void main(String[] args) {
        int[][] numbers = {{6, 750, 13, 14},
                {15, 84, 35, 90}};
        System.out.println(max(numbers));
    }

    public static int max(int[][] numbers) {
        int max = numbers [0][0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers [i][j] > max){
                max = numbers [i][j];}
            }
        }
        return max;
    }
}