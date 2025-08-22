public class Cat extends Animal {
    private static int numberOfCats;
    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String breed) {
        super(breed);
        numberOfCats++;
    }

    @Override
    public void run(int lengthOfTheObstacle) {
        if (lengthOfTheObstacle < MAX_RUN_DISTANCE) {
            System.out.println(getBreed() + " пробежал " + lengthOfTheObstacle + " м.");
        } else {
            System.out.println("У котов ограничение по бегу 200 м.");
        }
    }

    public static int amountOf() {
        return numberOfCats;
    }
}
