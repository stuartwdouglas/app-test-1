package com.redhat.demo.api;

import java.lang.String;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/machine")
public interface Machine {
  @GET
  @Produces("application/json")
  List<String> getsAListOfAllTheMachines();

  @Path("/{id}")
  @GET
  void generatedMethod1(@PathParam("id") String id);
}
