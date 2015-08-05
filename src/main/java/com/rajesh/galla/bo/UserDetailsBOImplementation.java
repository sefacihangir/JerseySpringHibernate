package com.rajesh.galla.bo;

import com.rajesh.galla.bo.intrface.UserDetailsBO;
import com.rajesh.galla.dao.UserDetailsDAOImplementation;
import com.rajesh.galla.dao.intrface.UserDetailsDAO;
import com.rajesh.galla.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rajeshgalla on 7/7/15.
 */

@Component
public class UserDetailsBOImplementation implements UserDetailsBO{

    @Autowired
    private UserDetailsDAO userDetailsDAO;
    private List<UserDetails> users;

    public UserDetailsBOImplementation() {
    }


    public UserDetailsDAO getUserDetailsDAO() {
        return userDetailsDAO;
    }

    public void setUserDetailsDAO(UserDetailsDAO userDetailsDAO) {
        this.userDetailsDAO = userDetailsDAO;
    }

    @Override
    public List<UserDetails> setUsers() {

        return userDetailsDAO.putUser();
    }

    @Override
    public List<UserDetails> getUsers() {
        return users;
    }

    @Override
    public List<UserDetails> postUser() {
        return null;
    }
}
