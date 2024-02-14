package ua.nezhura.hw13;

import com.google.gson.Gson;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        InputStream inputStream = Main.class.getResourceAsStream("/box.json");
        if (inputStream != null) {
            InputStreamReader reader = new InputStreamReader(inputStream);
            Box box = gson.fromJson(reader, Box.class);
            System.out.println("from: " + box.getFrom());
            System.out.println("material: " + box.getMaterial());
            System.out.println("color: " + box.getColor());
            System.out.println("max-lifting-capacity.unit: " + box.getMaxLiftingCapacity().getUnit());
            System.out.println("max-lifting-capacity.value: " + box.getMaxLiftingCapacity().getValue());
            System.out.println("cargo.name: " + box.getCargo().getName());
            System.out.println("cargo.class: " + box.getCargo().getClassName());
            System.out.println("delivery-date: " + box.getDeliveryDate());
        } else {
            System.err.println("File not found!");
        }
    }
}
