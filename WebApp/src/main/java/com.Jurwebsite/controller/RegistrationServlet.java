package com.Jurwebsite.controller;

import com.Jurwebsite.entity.User;
import com.Jurwebsite.hibernateFactory.Factory;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by User on 13.07.2017.
 */
public class RegistrationServlet extends APIHandlerServlet.APIRequestHandler {

    public static final RegistrationServlet instance = new RegistrationServlet();


    public static RegistrationServlet getInstance() {
        return instance;
    }

    private RegistrationServlet() {
    }

    @Override
    public JSONStreamAware processRequest(HttpServletRequest request) throws Exception {
        String login = request.getParameter("login");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new User();
        user.setEmail(email);
        user.setUserName(login);
        user.setPassword(password);
        Factory.getInstance().getUserDAO().addUser(user);

        System.out.println("login: " + login + "; email: " + email + "; password: " + password);
        return null;
    }
}
