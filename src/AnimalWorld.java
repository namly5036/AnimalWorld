interface Animal {
}

interface AnimalCanWalk extends Animal {
	void walk();
}

interface AnimalCanFly extends Animal {
	void fly();
}

interface AnimalCanSing extends Animal {
	void sing();
}

interface AnimalCanSwim extends Animal {
	void swim();
}

interface Bird extends AnimalCanWalk, AnimalCanSing {
}

class Duck implements Bird, AnimalCanSwim {
	@Override
	public void walk() {
		System.out.println("Duck is walking");
	}

	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

	@Override
	public void swim() {
		System.out.println("Duck is swimming");
	}

}

class Chicken implements Bird {
	@Override
	public void walk() {
		System.out.println("Chicken is walking");
	}

	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}
}

class Rooster1 extends Chicken {
	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}

class Rooster2 implements Bird {

	@Override
	public void walk() {
		System.out.println("Rooster 2 is walking");
	}

	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}

abstract class Parrot implements Bird {
	public void getType() {
		System.out.println("Parrot");
	}
}

class ParrotDog extends Parrot {
	@Override
	public void sing() {
		System.out.println("Woof, woof");
	}

	@Override
	public void walk() {
		System.out.println("ParrotDog is walking");
	}
}

class ParrotCat extends Parrot {
	@Override
	public void sing() {
		System.out.println("Meow");
	}

	@Override
	public void walk() {
		System.out.println("ParrotCat is walking");
	}
}

class ParrotRooster extends Parrot {
	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}

	@Override
	public void walk() {
		System.out.println("ParrotRooster is walking");
	}
}

class ParrotDuck extends Parrot {
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

	@Override
	public void walk() {
		System.out.println("ParrotDuck is walking");
	}
}

interface Fish extends AnimalCanSwim {
	void size();
	void color();
}

class FishNotSing implements Fish {
	@Override
	public void swim() {
		System.out.println("FishNotSing is swimming");
	}

	@Override
	public void size() {
		System.out.println("FishNotSing size");
	}

	@Override
	public void color() {
		System.out.println("FishNotSing color");
	}
}

class FishNotWalk implements Fish {
	@Override
	public void swim() {
		System.out.println("FishNotWalk is swimming");
	}

	@Override
	public void size() {
		System.out.println("FishNotWalk size");
	}

	@Override
	public void color() {
		System.out.println("FishNotWalk color");
	}
}

class Shark implements Fish {
	@Override
	public void swim() {
		System.out.println("Shark is swimming");
	}

	@Override
	public void size() {
		System.out.println("Shark is big");
	}

	@Override
	public void color() {
		System.out.println("Shark is grey");
	}
	
	public void eatOtherFish() {
		System.out.println("Shark is eat other fish");
	}
}

class Clownfish implements Fish {
	@Override
	public void swim() {
		System.out.println("Clownfish is swimming");
	}

	@Override
	public void size() {
		System.out.println("Clownfish is small");
	}

	@Override
	public void color() {
		System.out.println("Clownfish is colorful (orange)");
	}
	
	public void makeJoke() {
		System.out.println("Clownfish is makeJoke");
	}
}

class Dolphin implements AnimalCanSwim {
	@Override
	public void swim() {
		System.out.println("Dolphin is swimming");
	}
}

interface Caterpillar extends Animal {
}

class CaterpillarNotFly implements Caterpillar, AnimalCanWalk {

	@Override
	public void walk() {
		System.out.println("CaterpillarNotFly is waking");
	}
}

class CaterpillarCanWalk implements Caterpillar, AnimalCanWalk {

	@Override
	public void walk() {
		System.out.println("CaterpillarCanWalk is waking");
	}
}

interface Butterfly extends Caterpillar, AnimalCanFly, AnimalCanWalk {
}

class ButterflyCanFly implements Butterfly {

	@Override
	public void fly() {
		System.out.println("ButterflyCanFly is flying");
	}

	@Override
	public void walk() {
		System.out.println("ButterflyCanFly is walking");
	}
}

class ButterflyNotSing implements Butterfly {
	@Override
	public void fly() {
		System.out.println("ButterflyNotSing is flying");
	}

	@Override
	public void walk() {
		System.out.println("ButterflyNotSing is walking");
	}
}

public class AnimalWorld {
	public static int countAnimalsCanFly(Animal[] animals) {
		int count = 0;
		for (Animal animal : animals) {
			if (animal instanceof AnimalCanFly) {
				count ++;
			}
		}
		return count;
	}
	
	public static int countAnimalsCanWalk(Animal[] animals) {
		int count = 0;
		for (Animal animal : animals) {
			if (animal instanceof AnimalCanWalk) {
				count ++;
			}
		}
		return count;
	}
	
	public static int countAnimalsCanSing(Animal[] animals) {
		int count = 0;
		for (Animal animal : animals) {
			if (animal instanceof AnimalCanSing) {
				count ++;
			}
		}
		return count;
	}
	
	public static int countAnimalsCanSwim(Animal[] animals) {
		int count = 0;
		for (Animal animal : animals) {
			if (animal instanceof AnimalCanSwim) {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Shark shark = new Shark();
		shark.size();
		shark.color();
		shark.eatOtherFish();
		
		Clownfish clownfish = new Clownfish();
		clownfish.size();
		clownfish.color();
		clownfish.makeJoke();
		
		Dolphin dolphin = new Dolphin();
		dolphin.swim();
		
		ButterflyCanFly butterflyCanFly = new ButterflyCanFly();
		butterflyCanFly.fly();
		
		ButterflyNotSing butterflyNotSing = new ButterflyNotSing();
		butterflyNotSing.fly();
		
		CaterpillarNotFly caterpillarNotFly = new CaterpillarNotFly();
		caterpillarNotFly.walk();
		
		CaterpillarCanWalk caterpillarCanWalk = new CaterpillarCanWalk();
		caterpillarCanWalk.walk();
		
		// E. Counting animals
		Animal[] animals = new Animal[]{
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
		
		System.out.println(countAnimalsCanFly(animals));
		System.out.println(countAnimalsCanWalk(animals));
		System.out.println(countAnimalsCanSing(animals));
		System.out.println(countAnimalsCanSwim(animals));
	}
}
