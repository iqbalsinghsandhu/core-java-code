package chapterseven;

import java.util.*;

abstract class Animal {
	public abstract void checkup();
}

 class NewDog extends Animal {
	public void checkup() { // implement Dog-specific code
		System.out.println("Dog checkup");
	}
	
	//NewDog() {}	
}

class NewCat extends Animal {
	public void checkup() { // implement Cat-specific code
		System.out.println("Cat checkup");
	}
}

class Bird extends Animal {
	public void checkup() { // implement Bird-specific code
		System.out.println("Bird checkup");
	}
}

public class AnimalDoctor {
	// method takes an array of any animal subtype
	public void checkAnimals(Animal[] animals) {
		for (Animal a : animals) {
			a.checkup();
		}
	}
	
	public void addAnimal(Animal[] animals) {
		animals[0] = new NewDog(); // Eeek! We just put a Dog
		// in a Cat array!
		}

	public static void main(String[] args) {
		// test it
		NewDog[] dogs = { new NewDog(), new NewDog() };
		NewCat[] cats = { new NewCat(), new NewCat(), new NewCat() };
		Bird[] birds = { new Bird() };
		AnimalDoctor doc = new AnimalDoctor();
		doc.checkAnimals(dogs); // pass the Dog[]
		doc.checkAnimals(cats); // pass the Cat[]
		doc.checkAnimals(birds); // pass the Bird[]
		//doc.addAnimal(birds);
		
	}
}