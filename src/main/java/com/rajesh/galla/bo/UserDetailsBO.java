package com.rajesh.galla.bo;

import com.rajesh.galla.dao.UserDetailsDAO;
import com.rajesh.galla.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rajeshgalla on 7/7/15.
 */

@Component
public class UserDetailsBO {

    @Autowired
    private UserDetailsDAO userDetailsDAO;
    private List<UserDetails> users;

    public UserDetailsBO() {
    }

    public List<UserDetails> setUsers() {

        return userDetailsDAO.putUser();
    }

    public UserDetailsDAO getUserDetailsDAO() {
        return userDetailsDAO;
    }

    public void setUserDetailsDAO(UserDetailsDAO userDetailsDAO) {
        this.userDetailsDAO = userDetailsDAO;
    }

    public List<UserDetails> getUsers() {
        return users;
    }

    public List<UserDetails> postUser() {
        return null;
    }
}
