package ua.nezhura.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2},
                {3, 4}};

        System.out.println("original before: \n" + formatMatrix(numbers));
        System.out.println("transposed: \n" + formatMatrix(squareMatrixTranspose(numbers)));
        System.out.println("original after: \n" + formatMatrix(numbers));
    }

    public static String formatMatrix(int[][] matrix) {
        return Arrays.deepToString(matrix)
                .replace("], ", "]\n")
                .replaceAll("[\\[\\]]", "");
    }

    public static int[][] squareMatrixTranspose(int[][] matrix) {
        int length = matrix.length;
        int[][] transposedMatrix = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }
}


