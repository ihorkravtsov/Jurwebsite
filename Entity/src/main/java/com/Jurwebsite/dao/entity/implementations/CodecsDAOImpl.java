package com.Jurwebsite.dao.entity.implementations;

import com.Jurwebsite.dao.entity.entity.Codecs;
import com.Jurwebsite.dao.entity.interfaces.CodecsDAO;
import com.Jurwebsite.hibernateFactory.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by User on 04.07.2017.
 */
public class CodecsDAOImpl implements CodecsDAO {

    @Override
    public void addCodecs(Codecs codecs) throws SQLException {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save((codecs));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateCodecs(Codecs codecs) throws SQLException {
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.beginTransaction();
            session.update(codecs);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCodecs(Codecs codecs) throws SQLException {

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete((codecs));
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
