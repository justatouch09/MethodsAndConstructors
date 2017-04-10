package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class House {
    private double acre;
    private double area;
    private int year;
    private String color;
    private boolean brick;

    public House() {

    }

    public House(double acre, double area, int year, String color, boolean brick) {
        this.acre = acre;
        this.area = area;
        this.year = year;
        this.color = color;
        this.brick = brick;
    }

    public void setColor(String color) {
        if (color.contains ("green"))
            System.out.println("This color is correct!");
            this.color = color;
        }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAcre(double acre) {
        this.acre = acre;
    }

    public void setArea(double squarefoot) {
        this.area = squarefoot;
    }

    public void setBrick(boolean brick) {
        this.brick = brick;
    }

    public double getAcre() {
        return acre;
    }

    public double getArea() {
        return area;
    }

    public int getYear() {
        return year;
    }

    public boolean getBrick() {
        return brick;
    }

    public String getColor() {
        return color;
    }
}

