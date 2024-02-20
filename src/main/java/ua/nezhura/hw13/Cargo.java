package ua.nezhura.hw13;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Cargo {
    private String name;
    @SerializedName("class")
    private String className;
}
