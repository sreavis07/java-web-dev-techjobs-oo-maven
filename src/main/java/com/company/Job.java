package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private Job list;

    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;
        return id == job.id;
    }

    @Override
    public String toString() {
        if (this.name == "") {
            this.name = "Data Not Available";
        }
        if (this.employer.getValue() == "") {
            this.employer.setValue( "Data Not Available" );
        }
        if (this.location.getValue() == "") {
            this.location.setValue( "Data Not Available" );
        }
        if (this.positionType.getValue() == "") {
            this.positionType.setValue( "Data Not Available" );
        }
        if (this.coreCompetency.getValue() == "") {
            this.coreCompetency.setValue( "Data Not Available" );
        }
        return "\n" +
                "ID: " + this.id + "\n" +
                "Name: " + this.name + "\n" +
                "Employer: " + this.employer + "\n" +
                "Location: " + this.location + "\n" +
                "Position Type: " + this.positionType + "\n" +
                "Core Competency: " + this.coreCompetency + "\n";
    }
// TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
