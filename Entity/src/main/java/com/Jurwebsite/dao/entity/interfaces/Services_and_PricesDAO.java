package com.Jurwebsite.dao.entity.interfaces;

import com.Jurwebsite.dao.entity.entity.Services_and_Prices;

import java.sql.SQLException;

/**
 * Created by User on 04.07.2017.
 */
public interface Services_and_PricesDAO {
    public void addServices_and_Prices(Services_and_Prices services_and_prices) throws SQLException;
    public void updateServices_and_Prices(Services_and_Prices services_and_prices) throws SQLException;
    public void deleteServices_and_Prices(Services_and_Prices services_and_prices) throws SQLException;
}
