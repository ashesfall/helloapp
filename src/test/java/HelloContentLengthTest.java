import junit.framework.TestCase;
import org.junit.Test;
import webservices.HelloService;

public class HelloContentLengthTest {
	@Test
	public void runTest() {
		TestCase.assertEquals(new HelloService().doHello().length(), 12);
	}
}
