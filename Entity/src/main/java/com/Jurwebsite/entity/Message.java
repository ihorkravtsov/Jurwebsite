package com.Jurwebsite.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by User on 18.07.2017.
 */

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "message_id")
    public int messageId;

    @Column(name = "user_name")
    public String userName;

    @Column(name = "email")
    public String email;

    @Column(name = "message_text")
    private String messageText;


    public Message() {

    }

    public Message(String userName, String email, String messageText) {
        this.userName = userName;
        this.email = email;
        this.messageText = messageText;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
