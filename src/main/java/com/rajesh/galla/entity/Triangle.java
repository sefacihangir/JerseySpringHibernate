package com.rajesh.galla.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
@Entity
public class Triangle {

    @Id
    @GeneratedValue
    private long triangleID;
    private String pointA;
    private String pointB;
    private String pointC;

    @Override
    public String toString() {

        return getPointA()+", "+getPointB()+", "+getPointC();
    }

    public long getTriangleID() {
        return triangleID;
    }

    public void setTriangleID(long triangleID) {
        this.triangleID = triangleID;
    }

    public String getPointA() {
        return pointA;
    }

    public void setPointA(String pointA) {
        this.pointA = pointA;
    }

    public String getPointB() {
        return pointB;
    }

    public void setPointB(String pointB) {
        this.pointB = pointB;
    }

    public String getPointC() {
        return pointC;
    }

    public void setPointC(String pointC) {
        this.pointC = pointC;
    }

}
