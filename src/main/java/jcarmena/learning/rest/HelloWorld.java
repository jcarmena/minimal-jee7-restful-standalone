package jcarmena.learning.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
 

@Path("/helloworld")
public class HelloWorld {
 
    public HelloWorld() {}
 
    @GET
    @Produces("text/html")
    public String greeting() {
        return "<html><body>Hello, World</body></html>";
    }
}
