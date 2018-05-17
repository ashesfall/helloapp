import junit.framework.TestCase;
import org.junit.Test;
import webservices.HelloService;

public class HelloNullTest {
	@Test
	public void runTest() {
		TestCase.assertNotNull(new HelloService().doHello());
	}
}
