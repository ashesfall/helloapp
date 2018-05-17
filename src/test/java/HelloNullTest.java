import junit.framework.TestCase;
import org.junit.Test;
import webservices.HelloService;

public class HelloNullTest extends TestCase {
	@Test
	public void runTest() {
		assertNotNull(new HelloService().doHello());
	}
}
