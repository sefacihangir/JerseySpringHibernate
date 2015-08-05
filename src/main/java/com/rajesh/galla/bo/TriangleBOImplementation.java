package com.rajesh.galla.bo;

import com.rajesh.galla.bo.intrface.TriangleBO;
import com.rajesh.galla.dao.TriangleDAOImplementation;
import com.rajesh.galla.dao.intrface.TriangleDAO;
import com.rajesh.galla.entity.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rajeshgalla on 7/9/15.
 */

@Component
public class TriangleBOImplementation implements TriangleBO{

    @Autowired
    TriangleDAO triangleDAO;

    public TriangleDAO getTriangleDAO() {
        return triangleDAO;
    }

    public void setTriangleDAO(TriangleDAO triangleDAO) {
        this.triangleDAO = triangleDAO;
    }

    @Override
    public void save(Triangle triangle) {

        triangleDAO.save(triangle);
    }

    @Override
    public List<Triangle> getTriangles() {

        return triangleDAO.getTriangles();
    }
}
