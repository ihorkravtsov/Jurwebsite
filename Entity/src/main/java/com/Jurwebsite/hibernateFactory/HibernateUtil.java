package com.Jurwebsite.hibernateFactory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by User on 04.07.2017.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    static {
        try{
            sessionFactory =  new Configuration().configure().buildSessionFactory();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
