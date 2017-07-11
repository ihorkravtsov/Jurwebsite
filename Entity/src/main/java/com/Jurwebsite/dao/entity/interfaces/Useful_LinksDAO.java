package com.Jurwebsite.dao.entity.interfaces;

import com.Jurwebsite.dao.entity.entity.Useful_Links;

import java.sql.SQLException;

/**
 * Created by User on 04.07.2017.
 */
public interface Useful_LinksDAO {
    public void addUseful_Links(Useful_Links useful_links) throws SQLException;
    public void updateUseful_Links(Useful_Links useful_links) throws SQLException;
    public void deleteUseful_Links(Useful_Links useful_links) throws SQLException;
}
