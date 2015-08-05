package com.rajesh.galla.bo.intrface;

import com.rajesh.galla.entity.Triangle;

import java.util.List;

/**
 * Created by rajeshgalla on 8/2/15.
 */
public interface TriangleBO {

    void save(Triangle triangle);
    List<Triangle> getTriangles();
}
