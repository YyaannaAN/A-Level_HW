package ua.nezhura.hw12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class CSVBuilder {
    public static void main(String[] args) {
        List<String> lines = readAndFormat();
        writeToFile(lines, "output.csv");
    }

    public static List<String> readAndFormat() {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст (для завершения введите 'end'):");

        String line = scanner.nextLine();
        StringBuilder csvLine = new StringBuilder();

        while (!line.equals("end")) {
            if (line.equals("next")) {
                lines.add(csvLine.toString() + ",");
                csvLine = new StringBuilder();
            } else {
                if (csvLine.length() > 0) {
                    csvLine.append(", ");
                }
                csvLine.append(line);
            }
            line = scanner.nextLine();
        }

        lines.add(csvLine.toString());
        return lines;
    }

    public static void writeToFile(List<String> lines, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String ln : lines) {
                writer.append(ln);
                writer.append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл.");
            e.printStackTrace();
        }

        System.out.println("Файл output.csv успешно создан.");
    }

}

