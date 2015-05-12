package com.epam.khalii.DAO;

/**
 * Created by Anhelina_Khalii on 12.05.2015.
 */
public class Film_producer extends Entity {
    private int film_id;
    private int producer_id;

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public int getProducer_id() {
        return producer_id;
    }

    public void setProducer_id(int producer_id) {
        this.producer_id = producer_id;
    }

    public Film_producer() {
    }

    public Film_producer(int id) {
        super(id);
    }

    public Film_producer(int id, int film_id, int producer_id) {
        super(id);
        this.film_id = film_id;
        this.producer_id = producer_id;
    }
}
