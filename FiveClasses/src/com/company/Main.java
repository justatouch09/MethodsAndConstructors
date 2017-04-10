package com.company;

public class Main {

    public static void main(String[] args) {

        House h = new House();
        h.setColor("green");
        h.setYear(1990);
        h.setAcre(2.2);
        h.setBrick(true);
        h.setArea(2000.5);

        System.out.println(h.getColor());
        System.out.println(h.getYear());
        System.out.println(h.getAcre());
        System.out.println(h.getArea());
        System.out.println(h.getBrick());

        Bug b = new Bug();
        b.setType("spider");
        b.setLegs(8);
        b.setColor("black");
        b.setAge(24);
        b.setDeadly(true);

        System.out.println(b.getType());
        System.out.println(b.getLegs());
        System.out.println(b.getColor());
        System.out.println(b.getAge());
        System.out.println(b.getDeadly());

        SocialMedia s = new SocialMedia();
        s.setFont("red");
        s.setStyle("bold");
        s.setWeb(false);
        s.setPictures(18);
        s.setCharacters(100);

        System.out.println(s.getCharacters());
        System.out.println(s.getStyle());
        System.out.println(s.getWeb());
        System.out.println(s.getPictures());
        System.out.println(s.getFont());

        Movie m = new Movie();
        m.setMinutes(160);
        m.setYear(2005);
        m.setComedy(true);
        m.setScary(false);
        m.setColor("black and white");


        System.out.println(m.getMinutes());
        System.out.println(m.getYear());
        System.out.println(m.getComedy());
        System.out.println(m.getScary());
        System.out.println(m.getColor());

        Music k = new Music();
        k.setYear(2009);
        k.setRock(false);
        k.setTime(4);
        k.setRap(true);
        k.setCountry(false);

        System.out.println(k.getYear());
        System.out.println(k.getRock());
        System.out.println(k.getTime());
        System.out.println(k.getRap());
        System.out.println(k.getCountry());
    }

}




