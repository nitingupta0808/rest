package com.practice.rest;


import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("resources")
public class RestApplication extends ResourceConfig {
    public RestApplication() {
        packages("com.practice.rest.impl");
    }
}
