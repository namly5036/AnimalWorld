import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnimalWorldTest {
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	public static final String END_CHAR = "\r\n";

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(output));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	@Test
	public void testBirdSing() {
		Bird bird = new Bird();
		bird.sing();
		assertEquals("I am singing" + END_CHAR, output.toString());
	}
}