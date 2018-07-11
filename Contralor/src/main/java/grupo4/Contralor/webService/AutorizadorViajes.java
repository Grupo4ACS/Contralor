package grupo4.Contralor.webService;

import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("AutorizarViaje")

@Produces(MediaType.APPLICATION_JSON)
public class AutorizadorViajes {
  
    private Random rand = new Random();
    
    @GET
    public Response get() {
    	if (rand.nextBoolean()) {
    		return Response.accepted().build();
    	} else {
    		return Response.notAcceptable(null).build();
    	}    	
    }
  
    @PUT
	  public Response autorizar(Object paquete) {
      if (rand.nextBoolean()) {
    		return Response.accepted().build();
    	} else {
    		return Response.notAcceptable(paquete).build();
    	}    	
    }
}
