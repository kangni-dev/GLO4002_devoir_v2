package ca.ulaval.glo4002.tp.intro.question.domaine;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/health")
public class Health {

    @GET
    //@Path("")
    public Response checkTheHealth() {
        return Response.status(200).entity("Service working").build();
    }
}