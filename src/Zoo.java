import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
