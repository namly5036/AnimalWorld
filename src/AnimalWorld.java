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

public class AnimalWorld {
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.sing();
		duck.swim();

		Chicken chicken = new Chicken();
		chicken.sing();
	}
}
