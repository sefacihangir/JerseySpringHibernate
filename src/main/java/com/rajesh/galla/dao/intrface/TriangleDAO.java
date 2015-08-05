package com.rajesh.galla.dao.intrface;

import com.rajesh.galla.entity.Triangle;
import org.hibernate.FlushMode;

import java.util.List;

/**
 * Created by rajeshgalla on 8/2/15.
 */
public interface TriangleDAO {

    void save(Triangle triangle);

    List<Triangle> getTriangles();
}
