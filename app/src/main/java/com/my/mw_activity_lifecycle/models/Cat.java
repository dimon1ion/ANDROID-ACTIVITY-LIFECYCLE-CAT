package com.my.mw_activity_lifecycle.models;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String sound;

    public Cat(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
