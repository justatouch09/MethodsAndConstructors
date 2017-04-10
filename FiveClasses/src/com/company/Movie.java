package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class Movie {
    private int year;
    private boolean scary;
    private boolean comedy;
    private int minutes;
    private String color;

    public Movie() {

    }

    public Movie(int year, String color, boolean comedy, int minutes, boolean scary) {
        // code that will run if you type "new Bug(8, "black", "spider", 4, true);
        this.year = year;
        this.color = color;
        this.comedy = comedy;
        this.scary = scary;
        this.minutes = minutes;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMinutes(int minutes) {
        if (this.minutes < 160); {
            System.out.println("That is right");
        }
        this.minutes = minutes;

    }
    public void setYear(int year) {
        this.year = year;

    }

    public void setScary(boolean scary) {
        this.scary = scary;
    }

    public void setComedy(boolean comedy) {
        this.comedy = comedy;
    }

    public int getYear() {
        return year;
    }

    public boolean getScary() {
        return scary;
    }

    public boolean getComedy() {
        return comedy;
    }

    public int getMinutes() {
        return minutes;
    }

    public String getColor() {
        return color;
    }
}


