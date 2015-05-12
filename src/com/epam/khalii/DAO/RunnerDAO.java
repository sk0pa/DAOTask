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
    {
    }
    public static final String SQL_GET_LAST_FILMS = "select * from film where date > (((CURRENT_DATE - INTERVAL (DAY(CURRENT_DATE())-1) DAY) - INTERVAL (MONTH(CURRENT_DATE()) MONTH)-1)- INTERVAL 1 YEAR )";


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
