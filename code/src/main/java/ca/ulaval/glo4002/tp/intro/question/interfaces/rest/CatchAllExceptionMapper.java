package ca.ulaval.glo4002.tp.intro.question.interfaces.rest;

import ca.ulaval.glo4002.tp.intro.question.domaine.etablissement.EtablissementNonTrouveException;
import ca.ulaval.glo4002.tp.intro.question.interfaces.rest.dto.ErreurRest;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CatchAllExceptionMapper implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception) {
        var erreur = new ErreurRest(exception.getMessage());
        return Response.status(Status.INTERNAL_SERVER_ERROR).entity(erreur).build();
    }
}
