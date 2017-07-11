package com.Jurwebsite.main;

import com.Jurwebsite.dao.entity.entity.User;
import com.Jurwebsite.hibernateFactory.Factory;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by User on 06.07.2017.
 */
public class Main {
    public static void main(String[] args) throws SQLException {

        User u1 = new User();
        User u2 = new User();

        u1.setUserName("Petya");
        u1.setEmail("12345@gmail.com");

        u2.setUserName("Ira");
        u2.setEmail("678910@gmail.com");

        Factory.getInstance().getUserDAO().addUser(u1);
        Factory.getInstance().getUserDAO().addUser(u2);

        List<User> user = Factory.getInstance().getUserDAO().getAllUsers();
        System.out.println("=======all users=======");
        for (int i = 0; i < user.size(); i++) {
            System.out.println("student name: " + user.get(i).getUserName()
                    + ", email: " + user.get(i).getEmail());
            System.out.println("===========");

        }
    }
}
