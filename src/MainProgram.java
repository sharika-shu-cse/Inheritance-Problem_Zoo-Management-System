
public class MainProgram {
    public static void main(String[] args) {
        // Create animals
        Mammal lion = new Mammal("Lion", 5, 2);
        Bird parrot = new Bird("Parrot", 2, 0.25);
        Reptile snake = new Reptile("Snake", 3, 1.5);

        // Create zoo and add animals
        Zoo zoo = new Zoo();
        zoo.addAnimal(lion);
        zoo.addAnimal(parrot);
        zoo.addAnimal(snake);

        // Display all animals
        System.out.println("Animals in the zoo:");
        zoo.displayAnimals();
        System.out.println();

        // Make all animals make their sounds
        System.out.println("Animals making sounds:");
        zoo.makeAllSounds();
        System.out.println();

        // Perform specific actions
        lion.nurse();
        parrot.layEggs();
        snake.shedSkin();
    }
}
