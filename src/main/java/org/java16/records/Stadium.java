package org.java16.records;

import java.util.Objects;

public class Stadium {

    private String name;
    private String team;
    private int capacity;
    private Location location;

    public Stadium(String name, String team, int capacity, Location location) {
        this.name = name;
        this.team = team;
        this.capacity = capacity;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stadium stadium = (Stadium) o;
        return capacity == stadium.capacity && Objects.equals(name, stadium.name) && Objects.equals(team, stadium.team) && Objects.equals(location, stadium.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, team, capacity, location);
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", capacity=" + capacity +
                ", location=" + location +
                '}';
    }
}
