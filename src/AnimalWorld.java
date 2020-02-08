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

class Bird implements AnimalCanWalk, AnimalCanFly, AnimalCanSing {
	@Override
	public void walk() {
		System.out.println("I am walking");
	}
	
	@Override
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void sing() {
		System.out.println("I am singing");
	}
}

public class AnimalWorld {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}
}
