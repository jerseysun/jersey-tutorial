package xin.lingchao.web.jersey.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Health resource
 */
@Path("/health")
public class Health {

  private static final Logger log = LoggerFactory.getLogger(Health.class);

  /**
   * Method handling HTTP GET requests. The returned object will be sent to the client as
   * "text/plain" media type.
   *
   * @return String that will be returned as a text/plain response.
   */
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String GetIt() {
    log.trace("Get it");
    return "It works!";
  }
}
