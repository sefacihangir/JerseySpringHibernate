package com.rajesh.galla;

import com.rajesh.galla.resource.UserResource;
import com.rajesh.galla.resource.UsersResource;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Created by rajeshgalla on 7/9/15.
 * Telling the Jersey where to look for resource classes
 */


public class JerseyResourceInjection extends ResourceConfig{

    public JerseyResourceInjection() {

        System.out.println("JerseyResourceInjection");
        packages("com.rajesh.galla.resource");
    }
}