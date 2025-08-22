public abstract class Animal {
    private final String breed;
    private static int numberOfAnimal;

    public Animal(String breed) {
        this.breed = breed;
        numberOfAnimal++;
    }

    public String getBreed() {
        return breed;
    }

    public abstract void run(int lengthOfTheObstacle);

    public static int amountOf() {
        return numberOfAnimal;
    }
}
