package webservices;

import javax.ws.rs.Path;

@Path("/")
public class HelloService {
	@Path("Hello")
	public String doHello() {
		return "Hello, World";
	}
}
