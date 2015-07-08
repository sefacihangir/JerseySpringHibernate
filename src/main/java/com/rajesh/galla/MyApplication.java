package com.rajesh.galla;

import com.rajesh.galla.resource.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created by rajeshgalla on 7/9/15.
 */
public class MyApplication extends ResourceConfig{

    public MyApplication() {

        System.out.println("MyApplication");
        register(RequestContextFilter.class);
        register(UserResource.class);
    }
}
