package com.rajesh.galla.resource;

import com.rajesh.galla.bo.UserDetailsBO;
import com.rajesh.galla.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

@Component
@Path("/user")
public class UserResource {

    public Logger logger = Logger.getLogger("User Resource");

    @Autowired
    private UserDetailsBO userDetailsBO;

    public UserResource() {
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> getUsers() {

        logger.info("userDetailsBO " + userDetailsBO);
        return userDetailsBO.getUsers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<UserDetails> postUser() {

        logger.info("userDetailsBO " + userDetailsBO);
        return userDetailsBO.postUser();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> putUser() {

        logger.info("userDetailsBO " + userDetailsBO);
        return userDetailsBO.setUsers();
    }

    public UserDetailsBO getUserDetailsBO() {
        return userDetailsBO;
    }

    public void setUserDetailsBO(UserDetailsBO userDetailsBO) {
        this.userDetailsBO = userDetailsBO;
    }
}
