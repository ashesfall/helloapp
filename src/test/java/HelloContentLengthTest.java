import junit.framework.TestCase;
import webservices.HelloService;

public class HelloContentLengthTest  extends TestCase {
	public void runTest() {
		assertEquals(new HelloService().doHello().length(), 12);
	}
}
