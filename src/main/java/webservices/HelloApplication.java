package webservices;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("resources")
public class HelloApplication extends ResourceConfig {
	public HelloApplication() {
		packages("webservices");
	}
}
