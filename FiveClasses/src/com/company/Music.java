package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class Music {
    private int year;
    private boolean country;
    private boolean rap;
    private int time;
    private boolean rock;

    public Music() {

    }

    public Music(int year, boolean country, boolean rap, int time, boolean rock) {
        this.year = year;
        this.country = country;
        this.rap = rap;
        this.time = time;
        this.rock = rock;
    }

    public void setYear(int year) {
        if (this.year > 2018)
            System.out.println("That is wrong");
            this.year = year;
        }

    public void setCountry(boolean country) {
        this.country = country;
    }

    public void setRap(boolean rap) {
        this.rap = rap;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setRock(boolean rock) {
        this.rock = rock;
    }

    public int getYear() {
        return year;
    }

    public boolean getCountry() {
        return country;
    }

    public boolean getRap() {
        return rap;
    }

    public int getTime() {
        return time;
    }

    public boolean getRock() {
        return rock;
    }
}

