package com.epam.khalii.DAO;

/**
 * Created by Anhelina_Khalii on 12.05.2015.
 */
public class Film_actor extends Entity {
    private int film_id;
    private int actor_id;

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getActor_id() {
        return actor_id;
    }

    public void setActor_id(int actor_id) {
        this.actor_id = actor_id;
    }

    public Film_actor() {
    }

    public Film_actor(int id) {
        super(id);
    }

    public Film_actor(int id, int film_id, int actor_id) {
        super(id);
        this.film_id = film_id;
        this.actor_id = actor_id;
    }
}
