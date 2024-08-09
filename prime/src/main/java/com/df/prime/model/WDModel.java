package com.df.prime.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WDModel {
    public WDModel() {
    }

    @Override
    public String toString() {
        return "WDModel{" +
                "time=" + time +
                ", availability=" + availability +
                '}';
    }

    private int time;
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
}
