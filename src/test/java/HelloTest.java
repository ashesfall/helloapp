import junit.framework.TestCase;
import org.junit.Test;
import webservices.HelloService;

public class HelloTest extends TestCase {
	@Test
	public void checkMessageNPE() {
		assertNotNull(new HelloService().doHello());
	}

	@Test
	public void checkMessageContents() {
		assertEquals(new HelloService().doHello(), "Hello, World");
	}
}
