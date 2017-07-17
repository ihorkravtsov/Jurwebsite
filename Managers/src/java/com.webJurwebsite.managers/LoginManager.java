package com.webJurwebsite.managers;

import com.Jurwebsite.dao.entity.entity.User;
import com.Jurwebsite.hibernateFactory.Factory;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by User on 13.07.2017.
 */
public class LoginManager {
    public String[] loginController(Map<String, String[]> paramMap) throws Exception {
        String[] resultData = new String [2];
        String name = paramMap.get("login")[0];
        String password = paramMap.get("password")[0];
        User currentUser = null;
        try {
            currentUser = Factory.getInstance().getUserDAO().getUserByName(name);
        }catch(SQLException e){
            System.err.println("Enable to connect");
            e.printStackTrace();
        }
        if(currentUser!=null){
            String tempPassword = currentUser.getPassword();
            if(password.equals(tempPassword)) {
                resultData[0] = currentUser.getUserName();
                resultData[1] = String.valueOf(currentUser.getIdUser());
                return resultData;
            } throw new Exception();
        }else{
            throw new Exception();
        }

    }
}
