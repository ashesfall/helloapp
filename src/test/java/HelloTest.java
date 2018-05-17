import junit.framework.TestCase;
import org.junit.Test;

public class HelloTest extends TestCase {
	@Test
	public void checkMessage() {
		assertEquals(new HelloService().doHello(), "Hello, World");
	}
}
