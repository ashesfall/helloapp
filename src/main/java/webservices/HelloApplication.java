package webservices;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class HelloApplication extends ResourceConfig {
	public HelloApplication() {
		System.out.println("HelloApplication: Introducing webservice packages...");
		packages("webservices");
	}
}
