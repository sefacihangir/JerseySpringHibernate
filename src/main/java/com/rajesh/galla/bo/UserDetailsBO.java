package com.rajesh.galla.bo;

import com.rajesh.galla.entity.UserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rajeshgalla on 7/7/15.
 */

@Component
public class UserDetailsBO {

    public List<UserDetails> setUsers() {

        List<UserDetails> list = new LinkedList<>();
        UserDetails userDetails = new UserDetails("Rajesh");
        list.add(userDetails);
        return list;
    }

    public UserDetailsBO() {
    }
}
