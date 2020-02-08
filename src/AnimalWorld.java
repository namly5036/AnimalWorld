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

class Fish implements AnimalCanSwim {
	public void swim() {
		System.out.println("Fish is swimming");
	}
}

class FishNotSing extends Fish {
	public void swim() {
		System.out.println("FishNotSing is swimming");
	}
}

class FishNotWalk extends Fish {
	public void swim() {
		System.out.println("FishNotWalk is swimming");
	}
}

public class AnimalWorld {
	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.swim();

		FishNotSing fishNotSing = new FishNotSing();
		fishNotSing.swim();
		
		FishNotWalk fishNotWalk = new FishNotWalk();
		fishNotWalk.swim();
	}
}
