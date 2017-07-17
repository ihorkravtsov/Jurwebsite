package com.Jurwebsite.dao.entity.interfaces;

import com.Jurwebsite.dao.entity.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by User on 06.07.2017.
 */
public interface UserDAO {
    public void addUser(User user) throws SQLException;

    public void updateUser(User user) throws SQLException;

    public void deleteUser(User user) throws SQLException;

    public List<User> getAllUsers() throws SQLException;

    public User getUserByName(String name) throws SQLException;

    public Long getUserIdByName(String name) throws SQLException;

    public User getUserById(long id)throws SQLException;

}
