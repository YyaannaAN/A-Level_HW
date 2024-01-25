package ua.nezhura.hw7;

import java.util.Random;

public class Task2Vector {
    double x;
    double y;
    double z;

    public Task2Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        double lengthSquared = x * x + y * y + z * z;
        return Math.sqrt(lengthSquared);
    }

    public Task2Vector crossProduct(Task2Vector other) {
        double newX = y * other.z - z * other.y;
        double newY = z * other.x - x * other.z;
        double newZ = x * other.y - y * other.x;
        return new Task2Vector(newX, newY, newZ);
    }

    public double cosineAngle(Task2Vector other) {
        double dotProduct = dotProduct(other);
        double lengthProduct = length() * other.length();
        return dotProduct / lengthProduct;
    }

    public double dotProduct(Task2Vector other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Task2Vector add(Task2Vector other) {
        double newX = x + other.x;
        double newY = y + other.y;
        double newZ = z + other.z;
        return new Task2Vector(newX, newY, newZ);
    }

    // Метод для вычитания векторов
    public Task2Vector subtract(Task2Vector other) {
        double newX = x - other.x;
        double newY = y - other.y;
        double newZ = z - other.z;
        return new Task2Vector(newX, newY, newZ);
    }

    public static Task2Vector[] generateRandomVectors(int n) {
        Random random = new Random();
        Task2Vector[] vectors = new Task2Vector[n];
        for (int i = 0; i < n; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double z = random.nextDouble();
            vectors[i] = new Task2Vector(x, y, z);
        }
        return vectors;
    }

    public static void main(String[] args) {
        Task2Vector vector1 = new Task2Vector(1, 2, 3);
        Task2Vector vector2 = new Task2Vector(4, 5, 6);
        double length = vector1.length();
        System.out.println("Длина вектора1: " + length);
        Task2Vector crossProduct = vector1.crossProduct(vector2);
        System.out.println("Векторное произведение векторов 1 и 2: " + crossProduct.x + ", " + crossProduct.y + ", " + crossProduct.z);
        double cosineAngle = vector1.cosineAngle(vector2);
        System.out.println("Косинус угла между векторами 1 и 2: " + cosineAngle);

        Task2Vector sum = vector1.add(vector2);
        System.out.println("Сумма векторов 1 и 2: " + sum.x + ", " + sum.y + ", " + sum.z);

        Task2Vector difference = vector1.subtract(vector2);
        System.out.println("Разность векторов 1 и 2: " + difference.x + ", " + difference.y + ", " + difference.z);

        Task2Vector[] randomVectors = Task2Vector.generateRandomVectors(5);
        for (int i = 0; i < randomVectors.length; i++) {
            System.out.println("Случайный вектор " + (i + 1) + ": " + randomVectors[i].x + ", " + randomVectors[i].y + ", " + randomVectors[i].z);
        }
    }
}

