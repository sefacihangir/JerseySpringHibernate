package com.rajesh.galla.resource;

import com.rajesh.galla.bo.TriangleBO;
import com.rajesh.galla.entity.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
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
    protected TriangleBO triangleBO;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Triangle> getTriangles() {

        return triangleBO.getTriangles();
    }
}
