package com.Jurwebsite.interfaces;

import com.Jurwebsite.entity.Message;

import java.sql.SQLException;

/**
 * Created by User on 18.07.2017.
 */
public interface MessageDAO {
    public void addMessage(Message message) throws SQLException;
    public void updateMessage(Message message) throws SQLException;
    public void deleteMessage(Message message) throws SQLException;
}
