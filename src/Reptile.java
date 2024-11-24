
public class Reptile extends Animal {
    double tailLength;

    public Reptile(String name, int age, double tailLength) {
        super(name, age);
        this.tailLength = tailLength;
    }

    public void shedSkin() {
        System.out.println(name + " is shedding its skin.");
    }


    public void makeSound() {
        System.out.println(name + " makes a reptile sound.");
    }

    public String toString() {
        return super.toString() + ", Tail Length: " + tailLength + " meters";
    }
}
