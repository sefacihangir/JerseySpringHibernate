package com.rajesh.galla.dao;

import com.rajesh.galla.entity.Triangle;
import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by rajeshgalla on 7/9/15.
 */

@Repository
@Transactional
public class TriangleDAO extends HibernateDaoSupport {

    public void save(Triangle triangle) {

        System.out.println("Transactional Triangle " + triangle);
        getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
        getHibernateTemplate().save(Triangle.class.getName(),triangle);
    }

    public List<Triangle> getTriangles() {

        return getHibernateTemplate().loadAll(Triangle.class);
    }
}
