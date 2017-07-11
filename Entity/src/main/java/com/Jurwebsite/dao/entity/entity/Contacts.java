package com.Jurwebsite.dao.entity.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by User on 04.07.2017.
 */

@Entity
@Table(name = "contacts")
public class Contacts {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "contacts_id")
    private int contacstId;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "adress")
    private String adress;

    public Contacts() {

    }

    public Contacts(String phone, String email, String adress) {
        this.phone = phone;
        this.email = email;
        this.adress = adress;
    }

    public int getContacstId() {
        return contacstId;
    }

    public void setContacstId(int contacstId) {
        this.contacstId = contacstId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
