package com.Jurwebsite.implementations;

import com.Jurwebsite.entity.Services_and_Prices;
import com.Jurwebsite.interfaces.Services_and_PricesDAO;
import com.Jurwebsite.hibernateFactory.HibernateUtil;
import org.hibernate.Session;

import java.sql.SQLException;

/**
 * Created by User on 04.07.2017.
 */
public class Services_and_PricesDAOImpl implements Services_and_PricesDAO {
    @Override
    public void addServices_and_Prices(Services_and_Prices services_and_prices) throws SQLException{
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.save((services_and_prices));
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateServices_and_Prices(Services_and_Prices services_and_prices) throws SQLException {
        try(Session session = HibernateUtil.getSessionFactory().openSession();){
            session.beginTransaction();
            session.update(services_and_prices);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteServices_and_Prices(Services_and_Prices services_and_prices) throws SQLException {

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();
            session.delete((services_and_prices));
            session.getTransaction().commit();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


}
