package com.rajesh.galla.entity;

/**
 * Created by rajeshgalla on 7/7/15.
 */
public class UserDetails {

    public UserDetails() {
    }

    public UserDetails(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
