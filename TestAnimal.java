public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Dolly");
        Animal sheep2 = registry.createSheep("Molly");
        Animal cow = registry.createCow();
        Animal horse = registry.createHorse();


        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(cow);
        System.out.println(horse);

        sheep1.makeSound();
        cow.makeSound();
        horse.makeSound();
    }
}