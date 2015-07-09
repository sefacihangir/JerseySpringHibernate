package com.rajesh.galla.resource;

import com.rajesh.galla.bo.UserDetailsBO;
import com.rajesh.galla.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.LinkedList;
import java.util.List;

@Component
@Path("/users")
public class UserResource {

    public UserResource() {
    }

//    @Autowired
    private UserDetailsBO userDetailsBO;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> getUsers() {

        System.out.println("userDetailsBO " + userDetailsBO);
        return userDetailsBO.setUsers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> postUsers() {

        System.out.println("userDetailsBO " + userDetailsBO);
        return userDetailsBO.setUsers();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> putUsers() {

        System.out.println("userDetailsBO " + userDetailsBO);
        return userDetailsBO.setUsers();
    }


    public UserDetailsBO getUserDetailsBO() {
        return userDetailsBO;
    }

    public void setUserDetailsBO(UserDetailsBO userDetailsBO) {
        this.userDetailsBO = userDetailsBO;
    }
}
