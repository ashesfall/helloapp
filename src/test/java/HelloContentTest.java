import junit.framework.TestCase;
import org.junit.Test;
import webservices.HelloService;

public class HelloContentTest {
	@Test
	public void runTest() {
		TestCase.assertEquals(new HelloService().doHello(), "Hello, World");
	}
}
