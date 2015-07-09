package com.rajesh.galla.bo;

import com.rajesh.galla.dao.TriangleDAO;
import com.rajesh.galla.entity.Triangle;

/**
 * Created by rajeshgalla on 7/9/15.
 */
public class TriangleBO {

    TriangleDAO triangleDAO;

    public TriangleDAO getTriangleDAO() {
        return triangleDAO;
    }

    public void setTriangleDAO(TriangleDAO triangleDAO) {
        this.triangleDAO = triangleDAO;
    }

    public void save(Triangle triangle) {

        triangleDAO.save(triangle);
    }
}
