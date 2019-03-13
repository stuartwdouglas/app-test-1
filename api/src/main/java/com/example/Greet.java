package com.example;

import java.lang.String;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/greet")
public interface Greet {
  /**
   * Greets the person
   */
  @GET
  void generatedMethod1(@QueryParam("name") String name);
}
