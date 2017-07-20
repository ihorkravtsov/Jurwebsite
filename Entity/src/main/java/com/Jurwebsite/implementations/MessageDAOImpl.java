package com.Jurwebsite.implementations;

import com.Jurwebsite.entity.Message;
import com.Jurwebsite.hibernateFactory.HibernateUtil;
import com.Jurwebsite.interfaces.MessageDAO;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by User on 18.07.2017.
 */
public class MessageDAOImpl implements MessageDAO {

    @Override
    public void addMessage(Message message) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save((message));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateMessage(Message message) throws SQLException {
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.beginTransaction();
            session.update(message);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteMessage(Message message) throws SQLException {

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete((message));
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
