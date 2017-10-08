package com.gaolei.provider.model;

import java.io.Serializable;

/**
 * Created by gaolei on 2017/10/7.
 */
public class User implements Serializable{

    private static final Long seriaVersionUID = 1L
            ;
    private  Integer Id;
    private  String Namme;


    public User() {
    }

    public User(Integer id, String namme) {
        Id = id;
        Namme = namme;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNamme() {
        return Namme;
    }

    public void setNamme(String namme) {
        Namme = namme;
    }

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", Namme='" + Namme + '\'' +
                '}';
    }
}
