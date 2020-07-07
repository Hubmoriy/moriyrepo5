package com.alankay.domain;

import java.io.Serializable;

/**
 * description(描述):
 * author（作者）：河流
 * time：2020/7/214:08
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private double moeny;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoeny() {
        return moeny;
    }

    public void setMoeny(double moeny) {
        this.moeny = moeny;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", moeny=" + moeny +
                ", id=" + id +
                '}';
    }
}
