package com.Jurwebsite.managers;

import com.Jurwebsite.entity.Message;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by User on 20.07.2017.
 */
public class MessageManager {
    private static MessageManager instanse = null;

    public static MessageManager getMessageManager() {
        if (instanse == null) {
            instanse = new MessageManager();
        }
        return instanse;
    }

    public void addMessage(Map<String, String[]> mapParam) throws Exception {

        int id = Integer.parseInt(mapParam.get("index")[0]);

        String messageText = mapParam.get("messageText")[0];

        Message message = new Message();
    }

}

