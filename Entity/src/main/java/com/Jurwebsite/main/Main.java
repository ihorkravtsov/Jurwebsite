package com.Jurwebsite.main;

import com.Jurwebsite.entity.Message;
import com.Jurwebsite.hibernateFactory.Factory;

import java.sql.SQLException;

/**
 * Created by User on 06.07.2017.
 */
public class Main {
    public static void main(String[] args) throws SQLException {

        /*Contacts contact = new Contacts();
        //User u2 = new User();

        contact.setPhone("067-577-57-57");
        contact.setEmail("0675775757@gmail.com");
        contact.setAdress("61000, Kharkiv, Klochkivska 105");

        //u2.setUserName("Ira");
        //u2.setEmail("678910@gmail.com");

        Factory.getInstance().getContactsDAO().addContacs(contact);
        //Factory.getInstance().getUserDAO().addUser(u2);

        /*List<User> user = Factory.getInstance().getUserDAO().getAllUsers();
        System.out.println("=======all users=======");
        for (int i = 0; i < user.size(); i++) {
            System.out.println("student name: " + user.get(i).getUserName()
                    + ", email: " + user.get(i).getEmail());
            System.out.println("===========");

        }
        */

        Message message = new Message();

        message.setUserName("Igor");
        message.setEmail("Igor@gmail.com");
        message.setMessageText("site site site");

        Factory.getInstance().getMessageDAO().addMessage(message);


    }
}
