package com.Jurwebsite.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by User on 04.07.2017.
 */

@Entity
@Table(name = "codecs")
public class Codecs {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "codecs_id")
    private int codecsId;

    @Column(name = "codec_name")
    private String codecsName;

    @Column(name = "year")
    private int year;

    public Codecs() {

    }

    public Codecs(int codecs_id, String codecs_name, int year) {
        this.codecsId = codecs_id;
        this.codecsName = codecs_name;
        this.year = year;
    }

    public int getCodecsId() {
        return codecsId;
    }

    public void setCodecsId(int codecsId) {
        this.codecsId = codecsId;
    }

    public String getCodecsName() {
        return codecsName;
    }

    public void setCodecsName(String codecsName) {
        this.codecsName = codecsName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
