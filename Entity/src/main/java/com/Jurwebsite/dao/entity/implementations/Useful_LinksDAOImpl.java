package com.Jurwebsite.dao.entity.implementations;

import com.Jurwebsite.dao.entity.entity.Useful_Links;
import com.Jurwebsite.dao.entity.interfaces.Useful_LinksDAO;
import com.Jurwebsite.hibernateFactory.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by User on 04.07.2017.
 */
public class Useful_LinksDAOImpl implements Useful_LinksDAO {

    @Override
    public void addUseful_Links(Useful_Links useful_links) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save((useful_links));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateUseful_Links(Useful_Links useful_links) throws SQLException {
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.beginTransaction();
            session.update(useful_links);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUseful_Links(Useful_Links useful_links) throws SQLException {

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete((useful_links));
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
