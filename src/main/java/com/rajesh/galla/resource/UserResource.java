package com.rajesh.galla.resource;

import com.mysql.jdbc.log.LogFactory;
import com.rajesh.galla.bo.UserDetailsBO;
import com.rajesh.galla.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

@Component
@Path("/users")
public class UserResource {

    public Logger logger = Logger.getLogger("User Resource");

    public UserResource() {
    }

    @Autowired
    private UserDetailsBO userDetailsBO;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> getUsers() {

        logger.info("userDetailsBO " + userDetailsBO);
        return userDetailsBO.setUsers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> postUsers() {

        logger.info("userDetailsBO " + userDetailsBO);
        return userDetailsBO.setUsers();
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> putUsers() {

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
