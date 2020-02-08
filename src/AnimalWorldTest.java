import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnimalWorldTest {
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	public static final String END_CHAR = "\r\n";
	public static Animal[] animals = new Animal[]{
			 new Duck(),
			 new Chicken(),
			 new Rooster1(),
			 new ParrotCat(),
			 new FishNotSing(),
			 new Shark(),
			 new Clownfish(),
			 new Dolphin(),
			 new ButterflyCanFly(),
			 new CaterpillarCanWalk()
			};

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(output));
	}

	@After
	public void cleanUpStreams() {
		System.setOut(null);
	}

	//A. Let’s start with the basics
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
	
	@Test
	public void testParrotDogSing() {
		ParrotDog parrotDog = new ParrotDog();
		parrotDog.sing();
		assertEquals("Woof, woof" + END_CHAR, output.toString());
	}
	
	@Test
	public void testParrotCatSing() {
		ParrotCat parrotCat = new ParrotCat();
		parrotCat.sing();
		assertEquals("Meow" + END_CHAR, output.toString());
	}
	
	@Test
	public void testParrotRoosterSing() {
		ParrotRooster parrotRooster = new ParrotRooster();
		parrotRooster.sing();
		assertEquals("Cock-a-doodle-doo" + END_CHAR, output.toString());
	}
	
	@Test
	public void testParrotDuckSing() {
		ParrotDuck parrotDuck = new ParrotDuck();
		parrotDuck.sing();
		assertEquals("Quack, quack" + END_CHAR, output.toString());
	}
	
	//B. Model fish as well as other swimming animals
	@Test
	public void testFishNotSingSwim() {
		FishNotSing fishNotSing = new FishNotSing();
		fishNotSing.swim();
		assertEquals("FishNotSing is swimming" + END_CHAR, output.toString());
	}
	
	@Test
	public void testFishNotWalkSwim() {
		FishNotWalk fishNotWalk = new FishNotWalk();
		fishNotWalk.swim();
		assertEquals("FishNotWalk is swimming" + END_CHAR, output.toString());
	}
	
	@Test
	public void testSharkSize() {
		Shark shark = new Shark();
		shark.size();
		assertEquals("Shark is big" + END_CHAR, output.toString());
	}
	
	@Test
	public void testSharkColor() {
		Shark shark = new Shark();
		shark.color();
		assertEquals("Shark is grey" + END_CHAR, output.toString());
	}
	
	@Test
	public void testSharkEatOtherFish() {
		Shark shark = new Shark();
		shark.eatOtherFish();
		assertEquals("Shark is eat other fish" + END_CHAR, output.toString());
	}
	
	@Test
	public void testClownfishSize() {
		Clownfish clownfish = new Clownfish();
		clownfish.size();
		assertEquals("Clownfish is small" + END_CHAR, output.toString());
	}
	
	@Test
	public void testClownfishColor() {
		Clownfish clownfish = new Clownfish();
		clownfish.color();
		assertEquals("Clownfish is colorful (orange)" + END_CHAR, output.toString());
	}
	
	@Test
	public void testClownfishMakeJoke() {
		Clownfish clownfish = new Clownfish();
		clownfish.makeJoke();
		assertEquals("Clownfish is makeJoke" + END_CHAR, output.toString());
	}
	
	@Test
	public void testDolphinSwim() {
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		assertEquals("Dolphin is swimming" + END_CHAR, output.toString());
	}
	
	//D. Model animals that change their behaviour over time
	@Test
	public void testButterflyCanFlyFlying() {
		ButterflyCanFly butterflyCanFly = new ButterflyCanFly();
		butterflyCanFly.fly();
		assertEquals("ButterflyCanFly is flying" + END_CHAR, output.toString());
	}
	
	@Test
	public void testButterflyNotSingFlying() {
		ButterflyNotSing butterflyNotSing = new ButterflyNotSing();
		butterflyNotSing.fly();
		assertEquals("ButterflyNotSing is flying" + END_CHAR, output.toString());
	}
	
	@Test
	public void testCaterpillarNotFlyWalking() {
		CaterpillarNotFly caterpillarNotFly = new CaterpillarNotFly();
		caterpillarNotFly.walk();
		assertEquals("CaterpillarNotFly is waking" + END_CHAR, output.toString());
	}
	
	@Test
	public void testCaterpillarCanWalkWalking() {
		CaterpillarCanWalk caterpillarCanWalk = new CaterpillarCanWalk();
		caterpillarCanWalk.walk();
		assertEquals("CaterpillarCanWalk is waking" + END_CHAR, output.toString());
	}
	
	//E. Counting animals
	@Test
	public void testAnimalWorldCountAnimalsCanFly() {
		assertEquals(1, AnimalWorld.countAnimalsCanFly(animals));
	}
	
	@Test
	public void testAnimalWorldCountAnimalsCanWalk() {
		assertEquals(6, AnimalWorld.countAnimalsCanWalk(animals));
	}
	
	@Test
	public void testAnimalWorldCountAnimalsCanSing() {
		assertEquals(4, AnimalWorld.countAnimalsCanSing(animals));
	}
	
	@Test
	public void testAnimalWorldCountAnimalsCanSwim() {
		assertEquals(5, AnimalWorld.countAnimalsCanSwim(animals));
	}
	
	
}