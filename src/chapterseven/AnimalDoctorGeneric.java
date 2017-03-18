package chapterseven;

import java.util.*;

public class AnimalDoctorGeneric {
	// change the argument from Animal[] to ArrayList<Animal>
	public void checkAnimals(ArrayList<Animal> animals) {
		for (Animal a : animals) {
			a.checkup();
		}

	}

	public void addAnimal(List<? extends Animal> animals) {
		// animals.add(new NewDog());
	}

	public void addAnimal2(List<? super NewDog> animals) {
		animals.add(new NewDog());
	}

	public static void main(String[] args) {
		// make ArrayLists instead of arrays for Dog, Cat, Bird
		List<NewDog> dogs = new ArrayList<NewDog>();
		dogs.add(new NewDog());
		List<NewDog> animals = new ArrayList<NewDog>();
		// this code is the same as the Array version
		AnimalDoctorGeneric doc = new AnimalDoctorGeneric();
		animals.add(new NewDog());
		animals.add(dogs.get(0));
		doc.addAnimal(animals);
		doc.addAnimal2(animals);

	}
}
