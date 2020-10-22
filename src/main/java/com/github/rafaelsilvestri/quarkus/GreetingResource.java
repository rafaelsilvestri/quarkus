package com.github.rafaelsilvestri.quarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello() {
        HelloResponse response = new HelloResponse();
        response.setValue("hello");

        return Response.ok(response).build();
    }
}