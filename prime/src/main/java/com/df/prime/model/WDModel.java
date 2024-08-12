package com.df.prime.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Schema(description = "Model representing washer and dryer availability")
@Component
public class WDModel {
    public WDModel() {
    }


    @Schema(description = "The ID of the washer/dryer", example = "1")
    private int time;
    @Schema(description = "Availability status", example = "Available")
    private boolean availability= false;


    public WDModel(int time, boolean availability) {
        this.time = time;
        this.availability = availability;
    }


    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "WDModel{" +
                "time=" + time +
                ", availability=" + availability +
                '}';
    }
}
