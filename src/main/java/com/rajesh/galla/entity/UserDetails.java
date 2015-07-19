package com.rajesh.galla.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * Created by rajeshgalla on 7/7/15.
 */

@Component
@Entity
public class UserDetails {

    public UserDetails() {
    }

    @Id
    private Long userID;
    private String firstName;
    private String secondName;
    private String userName;
    private String emailID;
    private BigInteger mobileNumber;
    private Short countryCode;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public BigInteger getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(BigInteger mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Short getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Short countryCode) {
        this.countryCode = countryCode;
    }
}
