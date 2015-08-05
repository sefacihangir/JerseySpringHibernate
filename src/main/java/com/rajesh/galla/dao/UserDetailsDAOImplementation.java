package com.rajesh.galla.dao;

import com.rajesh.galla.dao.intrface.UserDetailsDAO;
import com.rajesh.galla.entity.UserDetails;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rajeshgalla on 7/7/15.
 */
@Repository
@Transactional
public class UserDetailsDAOImplementation extends HibernateDaoSupport implements UserDetailsDAO{

    public List<UserDetails> getUsers() {

        return new LinkedList<>();
    }

    public List<UserDetails> putUser() {

        return new LinkedList<>();
    }

    public List<UserDetails> postUser() {

        return new LinkedList<>();
    }

    public List<UserDetails> deleteUser() {

        return new LinkedList<>();
    }
}
