package com.rest.service.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import javax.ws.rs.core.MediaType;

@Path("/restservice")
@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})

public class Resource {
	
	@GET
	@Path("/health")
    public Response healthCheck() {
       return Response.status(Status.OK).build();
    }
	
	@POST
	@Path("/invoke")
    public Response service() {
       return Response.status(Status.CREATED).entity("success").build();
    }
}
