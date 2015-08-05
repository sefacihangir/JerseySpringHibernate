package com.rajesh.galla.bo.intrface;

import com.rajesh.galla.entity.UserDetails;

import java.util.List;

/**
 * Created by rajeshgalla on 8/2/15.
 */
public interface UserDetailsBO {

    public List<UserDetails> setUsers();

    public List<UserDetails> getUsers();

    public List<UserDetails> postUser();
}
