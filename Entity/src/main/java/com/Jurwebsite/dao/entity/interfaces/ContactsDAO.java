package com.Jurwebsite.dao.entity.interfaces;

import com.Jurwebsite.dao.entity.entity.Contacts;

import java.sql.SQLException;

/**
 * Created by User on 04.07.2017.
 */
public interface ContactsDAO {
    public void addContacs(Contacts contacts) throws SQLException;
    public void updateContacs(Contacts contacts) throws SQLException;
    public void deleteContacs(Contacts contacts) throws SQLException;
}
