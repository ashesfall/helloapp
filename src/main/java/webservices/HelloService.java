package webservices;

import javax.ws.rs.Path;

@Path("/Hello")
public class HelloService {
	@Path("")
	public String doHello() {
		return "Hello, World";
	}
}
