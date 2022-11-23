package E06_DefiningClasses.E09;

public class Hierarchy {
    String name;
    String breed;

    public Hierarchy(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return this.breed + " " + this.name;
    }
}
