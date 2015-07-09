package com.rajesh.galla.dao;

import com.rajesh.galla.entity.Triangle;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * Created by rajeshgalla on 7/9/15.
 */

public class TriangleDAO extends HibernateDaoSupport {

    public void save(Triangle triangle) {

        getHibernateTemplate().save(triangle);
    }
}
