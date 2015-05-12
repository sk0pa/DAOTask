package com.epam.khalii.DAO;

import java.util.Date;

/**
 * Created by Anhelina_Khalii on 12.05.2015.
 */
public class Actor extends Entity {
    private String name;
    private Date birth;

    public Actor() {
    }

    public Actor(int id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Actor(int id, String name, Date birth) {
        super(id);
        this.name = name;
        this.birth = birth;
    }
}
