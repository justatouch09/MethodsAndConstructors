package com.company;

/**
 * Created by jaradtouchberry on 3/28/17.
 */
public class SocialMedia {
    private String style;
    private String font;
    private int pictures;
    private int characters;
    private boolean web;

    public SocialMedia() {

    }

    public SocialMedia(String style, String font, int pictures, int characters, boolean web) {
        this.style = style;
        this.font = font;
        this.pictures = pictures;
        this.characters = characters;
        this.web = web;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setStyle(String style) {
        if (style.contains("Bold"))
            System.out.println("This is the right font");
            this.style = style;
    }

    public void setPictures(int pictures)
    {
        this.pictures = pictures;
    }

    public void setCharacters(int characters) {
       this.characters = characters;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public boolean getWeb() {
        return web;
    }

    public int getPictures() {
        return pictures;
    }

    public int getCharacters() {
        return characters;
    }

    public String getStyle() {
        return style;
    }

    public String getFont() {
        return font;
    }

}




