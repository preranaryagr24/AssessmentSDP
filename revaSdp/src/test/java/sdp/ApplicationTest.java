package sdp;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ApplicationTest {
	@Test
	public void addTest() {
		assertEquals(Application.add(2,3),5);
	}
}