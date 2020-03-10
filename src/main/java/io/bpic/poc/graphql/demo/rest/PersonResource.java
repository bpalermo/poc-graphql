package io.bpic.poc.graphql.demo.rest;

import io.bpic.poc.graphql.demo.service.PersonService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created: 3/10/20 2:47 PM.
 *
 * @author palermo
 */
@RequestScoped
@Path("person")
public class PersonResource {

    @Inject
    PersonService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response get() {
        return Response.ok(service.findAll(0, 20))
                .build();
    }

}
