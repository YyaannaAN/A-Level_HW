package ua.nezhura.hw13;

import lombok.Getter;

import com.google.gson.annotations.SerializedName;

@Getter
public class Box {
    private String from;
    private String material;
    private String color;

    @SerializedName("max-lifting-capacity")
    private LiftingCapacity maxLiftingCapacity;

    private Cargo cargo;

    @SerializedName("delivery-date")
    private String deliveryDate;

}
