package com.Jurwebsite.hibernateFactory;

import com.Jurwebsite.dao.entity.implementations.*;
import com.Jurwebsite.dao.entity.interfaces.*;

/**
 * Created by User on 06.07.2017.
 */
public class Factory {
    private static CodecsDAO codecsDAO = null;
    private static ContactsDAO contactsDAO = null;
    private static Services_and_PricesDAO services_and_pricesDAO = null;
    private static Useful_LinksDAO useful_linksDAO = null;
    private static UserDAO userDAO = null;

    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public CodecsDAO getCodecsDAO() {
        if (codecsDAO == null) {
            codecsDAO = new CodecsDAOImpl();
        }
        return codecsDAO;
    }

    public ContactsDAO getContactsDAO(){
        if (contactsDAO == null){
            contactsDAO = new ContactsDAOImpl();
        }
        return contactsDAO;
    }

    public Services_and_PricesDAO getServices_and_pricesDAO(){
        if (services_and_pricesDAO == null){
            services_and_pricesDAO = new Services_and_PricesDAOImpl();
        }
        return services_and_pricesDAO;
    }

    public Useful_LinksDAO getUseful_linksDAO(){
        if (useful_linksDAO == null){
            useful_linksDAO = new Useful_LinksDAOImpl();
        }
        return useful_linksDAO;
    }

    public UserDAO getUserDAO(){
        if (userDAO == null){
            userDAO = new UserDAOImpl();
        }
        return userDAO;
    }

}

