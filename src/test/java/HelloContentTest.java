import junit.framework.TestCase;
import webservices.HelloService;

public class HelloContentTest extends TestCase {
	public void runTest() {
		assertEquals(new HelloService().doHello(), "Hello, World");
	}
}
