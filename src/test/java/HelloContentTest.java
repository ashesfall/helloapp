import junit.framework.TestCase;
import org.junit.Test;
import webservices.HelloService;

public class HelloContentTest extends TestCase {
	@Test
	public void runTest() {
		assertEquals(new HelloService().doHello(), "Hello, World");
	}
}
