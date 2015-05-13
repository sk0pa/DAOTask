package com.epam.khalii.DAO;

import java.util.Date;

/**
 * Created by Anhelina_Khalii on 12.05.2015.
 */
public class Film extends Entity {
    private String name;
    private String country;
    private Date release;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public Film() {
    }

    public Film(int id) {
        super(id);
    }

    public Film(int id, String name, String country, Date release) {
        super(id);
        this.name = name;
        this.country = country;
        this.release = release;
    }

    public Film(String name, String country, Date release) {
        this.name = name;
        this.country = country;
        this.release = release;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", release=" + release +
                '}';
    }
}
