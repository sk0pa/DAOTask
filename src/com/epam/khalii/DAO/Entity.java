package com.epam.khalii.DAO;

/**
 * Created by Anhelina_Khalii on 12.05.2015.
 */
public class Entity {
    private int id;

    public Entity(){
    }

    public Entity(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
