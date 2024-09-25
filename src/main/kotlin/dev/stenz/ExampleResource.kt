package dev.stenz

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "Hello RESTEasy this is a live dev version test"
}
