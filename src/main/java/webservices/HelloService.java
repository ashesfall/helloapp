package webservices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloService {
	@Path("/hello")
	@GET
	public String doHello() {
		return "Hello, World";
	}
}
