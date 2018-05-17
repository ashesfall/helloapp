import junit.framework.TestCase;
import org.junit.Test;
import webservices.HelloService;

public class HelloContentLengthTest  extends TestCase {
	@Test
	public void runTest() {
		assertEquals(new HelloService().doHello().length(), 12);
	}
}
