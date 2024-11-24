public class Mammal extends Animal {
    int numberOfOffspring;

    public Mammal(String name, int age, int numberOfOffspring) {
        super(name, age);
        this.numberOfOffspring = numberOfOffspring;
    }

    public void nurse() {
        System.out.println(name + " is nursing.");
    }

    public void makeSound() {
        System.out.println(name + " makes a mammal sound.");
    }

    public String toString() {
        return super.toString() + ", Offspring: " + numberOfOffspring;
    }
}
