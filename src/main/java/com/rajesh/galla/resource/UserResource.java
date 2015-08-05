package com.rajesh.galla.resource;

import com.rajesh.galla.bo.UserDetailsBOImplementation;
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
    private UserDetailsBOImplementation userDetailsBOImplementation;

    public UserResource() {
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> getUsers() {

        logger.info("userDetailsBO " + userDetailsBOImplementation);
        return userDetailsBOImplementation.getUsers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<UserDetails> postUser() {

        logger.info("userDetailsBO " + userDetailsBOImplementation);
        return userDetailsBOImplementation.postUser();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> putUser() {

        logger.info("userDetailsBO " + userDetailsBOImplementation);
        return userDetailsBOImplementation.setUsers();
    }

    public UserDetailsBOImplementation getUserDetailsBOImplementation() {
        return userDetailsBOImplementation;
    }

    public void setUserDetailsBOImplementation(UserDetailsBOImplementation userDetailsBOImplementation) {
        this.userDetailsBOImplementation = userDetailsBOImplementation;
    }
}
