package com.epam.khalii.DAO;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anhelina_Khalii on 12.05.2015.
 */
public class RunnerDAO extends AbstractDAO <Actor, Film> {

    public static final String SQL_GET_LAST_FILMS = "select film_name, film_date, film_country from film where film_date > (((CURRENT_DATE - INTERVAL (DAY(CURRENT_DATE())-1) DAY) - INTERVAL (MONTH(CURRENT_DATE())-1) MONTH) - INTERVAL 1 YEAR )";
    public static final String SQL_GET_ACTORS_FROM_FILM = "select actor_name, actor_birth from actor, film_actor where film_actor.actor_id = actor.actor_id AND film_actor.film_id = %d";
    public static final String SQL_GET_ACTORS_WITH_LONG_FILMOGRAPHY ="select actor.actor_id, actor.actor_name, actor.actor_birth, COUNT(film_id) as filmography from actor, film_actor where film_actor.actor_id = actor.actor_id GROUP BY actor.actor_id HAVING count(film_id) > %d ";
    public static final String SQL_GET_PRODUCERS = "select DISTINCT actor.actor_name, actor.actor_birth from actor RIGHT JOIN film_producer ON film_producer.producer_id = actor.actor_id ";
    public static final String SQL_GET_OLD_FILMS = "delete from film where film_date < (CURRENT_DATE - INTERVAL %d YEAR) ";

    @Override
    public List<Film> findFilms() throws SQLException{

        List<Film> films = new ArrayList<Film>();
        Connection cn = null;
        Statement st = null;
        cn = ConnectorDB.getConnection();
        st = cn.createStatement();
        ResultSet rs = st.executeQuery(SQL_GET_LAST_FILMS);

    }

    @Override
    public List<Actor> findActors(Film film) throws SQLException{

    }

    @Override
    public List<Actor> findActors(int count) throws SQLException{

    }

    @Override
    public List<Actor> findProducers() throws SQLException{

    }

    @Override
    public void deleteOldFilms() throws SQLException{

    }
}
