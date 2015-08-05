package com.rajesh.galla.resource;

import com.rajesh.galla.bo.UserDetailsBOImplementation;
import com.rajesh.galla.entity.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by rajeshgalla on 7/12/15.
 */

@Component
@Path("/users")
public class UsersResource {

    public Logger logger = Logger.getLogger("Users Resource");

    @Autowired
    private UserDetailsBOImplementation userDetailsBOImplementation;

    public UsersResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserDetails> getUsers() {

        logger.info("userDetailsBO " + userDetailsBOImplementation);
        return userDetailsBOImplementation.getUsers();
    }

}
