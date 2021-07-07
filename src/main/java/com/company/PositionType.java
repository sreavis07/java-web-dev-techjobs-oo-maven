package com.company;

import java.util.Objects;

public class PositionType {
    private static int nextId = 1;

    private int id;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    @Override
    public String toString() {
        return this.value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when their id fields match.

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PositionType position = (PositionType) obj;
        return id == position.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // Getters and Setters:

    public int getId() { return this.id; };

    public String getValue() { return this.value; }

    public void setValue(String value) { this.value = value; }
}
