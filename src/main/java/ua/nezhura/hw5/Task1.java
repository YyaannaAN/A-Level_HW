package ua.nezhura.hw5;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        System.out.println("Original matrix before: \n" + formatMatrix(matrix));
        System.out.println("Filled matrix: \n" + formatMatrix(fillMatrix(matrix)));
        System.out.println("Original matrix after: \n" + formatMatrix(matrix));
    }

    public static String formatMatrix(int[][] matrix) {
        return Arrays.deepToString(matrix)
                .replace("], ", "]\n")
                .replaceAll("[\\[\\]]", "");
    }

    public static int[][] fillMatrix(int[][] matrix) {
        int count = 0;
        boolean isNegative;

        int[][] resultMatrix = deepCopy(matrix);

        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            isNegative = (i % 2) != 0;
            for (int j = 0; j < row.length; j++) {
                count++;
                if (isNegative) {
                    resultMatrix[i][j] = count * -1;
                } else {
                    resultMatrix[i][j] = count;
                }


            }
        }
        return resultMatrix;
    }

    public static int[][] deepCopy(int[][] original) {
        if (original == null) {
            return null;
        }

        int[][] result = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            result[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return result;
    }
}

