package com.rajesh.galla.resource;

import com.rajesh.galla.bo.TriangleBOImplementation;
import com.rajesh.galla.entity.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by rajeshgalla on 7/12/15.
 */

@Component
@Path("/triangles")
public class TrianglesResource {

    @Autowired
    protected TriangleBOImplementation triangleBOImplementation;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Triangle> getTriangles() {

        return triangleBOImplementation.getTriangles();
    }
}
