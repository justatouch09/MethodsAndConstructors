package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class Bug {
    private int legs;
    private String color;
    private String type;
    private int age;
    private boolean deadly;

    public Bug() {

    }

    public Bug(int legs, String color, String type, int age, boolean deadly) {
        this.legs = legs;
        this.color = color;
        this.type = type;
        this.age = age;
        this.deadly = deadly;
    }

    public void setType(String type) {
        if (type.contains("spider"));
            System.out.println("Special font");
            this.type = type;
        }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDeadly(boolean deadly) {
        this.deadly = deadly;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getLegs() {
        return legs;
    }

    public boolean getDeadly() {
        return deadly;
    }
}
