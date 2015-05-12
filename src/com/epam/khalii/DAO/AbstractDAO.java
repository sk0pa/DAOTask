package com.epam.khalii.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Anhelina_Khalii on 12.05.2015.
 */
public abstract class AbstractDAO<K,T extends Entity> {
    public abstract List<T> findFilms() throws SQLException;
    public abstract List<K> findActors(T film) throws SQLException;
    public abstract List<K> findActors(int count) throws SQLException;
    public abstract List<K> findProducers() throws SQLException;
    public abstract void deleteOldFilms() throws SQLException;

}
