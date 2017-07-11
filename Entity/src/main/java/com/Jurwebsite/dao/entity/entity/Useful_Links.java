package com.Jurwebsite.dao.entity.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by User on 04.07.2017.
 */
@Entity
@Table(name = "useful_links")
public class Useful_Links {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "useful_links_id")
    private int usefulLinksId;

    @Column(name = "useful_links_name")
    private String usefulLinksName;

    @Column(name = "useful_links_websites")
    private String usefulLinksWebsites;

    public Useful_Links() {

    }

    public Useful_Links(String usefulLinksName, String usefulLinksWebsites) {
        this.usefulLinksName = usefulLinksName;
        this.usefulLinksWebsites = usefulLinksWebsites;
    }

    public int getUsefulLinksId() {
        return usefulLinksId;
    }

    public void setUsefulLinksId(int usefulLinksId) {
        this.usefulLinksId = usefulLinksId;
    }

    public String getUsefulLinksName() {
        return usefulLinksName;
    }

    public void setUsefulLinksName(String usefulLinksName) {
        this.usefulLinksName = usefulLinksName;
    }

    public String getUsefulLinksWebsites() {
        return usefulLinksWebsites;
    }

    public void setUsefulLinksWebsites(String usefulLinksWebsites) {
        this.usefulLinksWebsites = usefulLinksWebsites;
    }
}
