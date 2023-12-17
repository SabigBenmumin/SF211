// Name (in English): Sabig Benmumin
// ID: 6510742197

import java.util.Random;

public class Q3 {
	public static void main(String[] args) {
		// uncomment line by line to test your code
		System.out.println("+++++ Test Dog +++++");
//		Dog jaguar = new Dog("Jaguar", "Jack");
//		System.out.println(jaguar);
//		System.out.println("I can live for " + jaguar.lifespan() + " years.");

		System.out.println("\n+++++ Test Banana +++++");
//		Banana goldfinger = new Banana("Goldfinger");
//		System.out.println("Fruit of the day: " + goldfinger);
//		System.out.println("How to eat: " + goldfinger.howToEat());

		System.out.println("\n+++++ Test Pig +++++");
//		Pig piggy = new Pig("Piggy");
//		System.out.println(piggy);
//		System.out.println("I can live for " + jaguar.lifespan() + " years.");

		System.out.println("\n+++++ Test Polymorphism with subclass +++++");
//		Animal[] animals = { jaguar, piggy, new Dog("Bella", "Jack") };
//		for (Animal animal : animals) {
//			System.out.println(animal);
//			System.out.println("I can live for " + animal.lifespan() + " years.");
//			System.out.println("I " + animal.makeSound());
//		}
//		System.out.println("Dog lives " + (jaguar.lifespan() - piggy.lifespan()) + " years longer.");

		System.out.println("\n+++++ Test Polymorphism with interface +++++");
//		Food[] foods = { goldfinger, piggy, new Banana("Cavendish") };
//		for (Food food : foods) {
//			System.out.println(food);
//			System.out.println("How to eat: " + food.howToEat());
//		}

		System.out.println("\n+++++ Test equals +++++");
//		System.out.println(jaguar.equals(animals[0]) + " should be true");
//		System.out.println(piggy.equals(goldfinger) + " should be false");

	}
}

abstract class Animal {
	private static final int AVERAGE_LIFESPAN = new Random().nextInt(6) + 10;

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public int lifespan() {
		return AVERAGE_LIFESPAN;
	}

	abstract public String makeSound();

	public String toString() {
		return "I am " + name + " (" + makeSound() + " " + makeSound() + ").";
	}

	public boolean equals(Object other) {
		if (!(other instanceof Animal))
			return false;
		Animal o = (Animal) other;
		return name.equals(o.name);
	}
}

interface Food {
	String howToEat();
}

//WRITE YOUR CODE HERE

class Dog extends Animal{
	private String owner;
	public Dog(String name; String owner){
		this.name = name;
		this.owner = owner;
	}
	@Override
	public int lifespan(){
		return super.lifespan() + 5;
	}
	@Override
	public String makeSound(){
		return "Woooooffff";
	}
}