public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Grass";
    }

    @Override
    public Animal clone() {
        Cow cow = new Cow();
        cow.legs = this.legs;
        cow.sound = this.sound;
        cow.food = this.food;
        return cow;
    }

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    @Override
    public String toString() {
        return "Cow [legs=" + legs + ", sound=" + sound + ", food=" + food + "]";
    }
}