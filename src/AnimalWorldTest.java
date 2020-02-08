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
	public void testDuckSing() {
		Duck duck = new Duck();
		duck.sing();
		assertEquals("Quack, quack" + END_CHAR, output.toString());
	}
	
	@Test
	public void testDuckSwim() {
		Duck duck = new Duck();
		duck.swim();
		assertEquals("Duck is swimming" + END_CHAR, output.toString());
	}

	@Test
	public void testChickenSing() {
		Chicken chicken = new Chicken();
		chicken.sing();
		assertEquals("Cluck, cluck" + END_CHAR, output.toString());
	}
	
	@Test
	public void testRooster1Sing() {
		Rooster1 rooster1 = new Rooster1();
		rooster1.sing();
		assertEquals("Cock-a-doodle-doo" + END_CHAR, output.toString());
	}
	
	@Test
	public void testRooster2Sing() {
		Rooster2 rooster2 = new Rooster2();
		rooster2.sing();
		assertEquals("Cock-a-doodle-doo" + END_CHAR, output.toString());
	}
	
	
}