package com.example.luanna.myapp.models;

import java.io.Serializable;
/**
 * Created by Luanna on 24/05/2017.
 */

public class Recipe implements Serializable {

    private String urlPhoto;
    private String name;

    public Recipe() {
    }

    public Recipe(String urlPhoto, String name) {
        this.urlPhoto = urlPhoto;
        this.name = name;
    }

    public String getUrlCover() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "urlPhoto='" + urlPhoto + '\'' +
                " name='" + name + '\'' +
                '}';
    }
}