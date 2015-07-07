package com.rajesh.galla.resource;

import com.rajesh.galla.entity.UserDetails;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

@Path("/users")
public class UserResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> getUsers() {

        return setUsers();
    }

    private List<UserDetails> setUsers() {

        List<UserDetails> list = new LinkedList<>();
        UserDetails userDetails = new UserDetails("Rajesh");
        list.add(userDetails);
        return list;
    }
}
