package com.Jurwebsite.controller;

import com.Jurwebsite.managers.MessageManager;
import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by User on 20.07.2017.
 */
public class MessageServlet extends APIHandlerServlet.APIRequestHandler {

    public static final MessageServlet instance = new MessageServlet();

    public static MessageServlet getInstance() {
        return instance;
    }

    private MessageServlet() {
    }

    @Override
    protected JSONStreamAware processRequest(HttpServletRequest request) throws Exception {
        Map<String, String[]> map = request.getParameterMap();
        String type = map.get("type")[0];
        // Map<String, String> dataFromDb = new HashMap<>();
        JSONObject jsonObject = new JSONObject();
        switch (type) {
            case "add_Message":
                jsonObject = addMessage(map);
                break;
            case "":
                break;

        }

        return jsonObject;

    }

    private JSONObject addMessage(Map<String, String[]> map) {
        JSONObject jsonObject = new JSONObject();

        String[] dbFunctionResponce = new String[2];
        try {
            MessageManager.getMessageManager().addMessage(map);
        } catch (Exception e) {
            jsonObject.put("State", "Error! Can't add message!");
            return jsonObject;
        }
        jsonObject.put("State", "The message was added!");
        return jsonObject;
    }
}
