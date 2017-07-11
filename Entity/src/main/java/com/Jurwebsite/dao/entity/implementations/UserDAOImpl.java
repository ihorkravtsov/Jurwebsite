package com.Jurwebsite.dao.entity.implementations;

import com.Jurwebsite.dao.entity.entity.User;
import com.Jurwebsite.dao.entity.interfaces.UserDAO;
import com.Jurwebsite.hibernateFactory.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 06.07.2017.
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public void addUser(User user) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save((user));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateUser(User user) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession();) {
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(User user) throws SQLException {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.delete((user));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<User> getAllUsers() throws SQLException {
        List<User> user = new ArrayList<User>();
        try (
                Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            user = session.createCriteria(User.class).list();
        } catch (
                Exception e)

        {
            e.printStackTrace();
        }
        return user;
    }
}

