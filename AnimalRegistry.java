import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    private Map<String, Animal> prototypes = new HashMap<>();

    public AnimalRegistry() {
        prototypes.put("Sheep", new Sheep());
        prototypes.put("Cow", new Cow());
        prototypes.put("Horse", new Horse());
    }

    public Animal createSheep(String name) {
        Sheep sheep = (Sheep) prototypes.get("Sheep").clone();
        sheep.setName(name);
        return sheep;
    }

    public Animal createCow() {
        return prototypes.get("Cow").clone();
    }

    public Animal createHorse() {
        return prototypes.get("Horse").clone();
    }
}