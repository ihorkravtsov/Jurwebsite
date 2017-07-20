package com.Jurwebsite.interfaces;

import com.Jurwebsite.entity.Codecs;

import java.sql.SQLException;

/**
 * Created by User on 04.07.2017.
 */
public interface CodecsDAO {
    public void addCodecs(Codecs codecs) throws SQLException;
    public void updateCodecs(Codecs codecs) throws SQLException;
    public void deleteCodecs(Codecs codecs) throws SQLException;
}
