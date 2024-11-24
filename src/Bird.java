
public class Bird extends Animal {
    double wingSpan;

    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public void layEggs() {
        System.out.println(name + " is laying eggs.");
    }


    public void makeSound() {
        System.out.println(name + " makes a bird sound.");
    }


    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan + " meters";
    }
}
