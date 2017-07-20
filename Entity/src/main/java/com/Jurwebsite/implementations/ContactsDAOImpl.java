package com.Jurwebsite.implementations;

import com.Jurwebsite.entity.Contacts;
import com.Jurwebsite.interfaces.ContactsDAO;
import com.Jurwebsite.hibernateFactory.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by User on 04.07.2017.
 */
public class ContactsDAOImpl implements ContactsDAO {
    @Override
    public void addContacs(Contacts contacts) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save((contacts));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateContacs(Contacts contacts) throws SQLException {
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.beginTransaction();
            session.update(contacts);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteContacs(Contacts contacts) throws SQLException {

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete((contacts));
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
