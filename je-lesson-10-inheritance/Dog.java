public class Dog extends Animal implements AnimalCanSwim {
    private static int numberOfDogs;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String breed) {
        super(breed);
        numberOfDogs++;
    }

    @Override
    public void swim(int lengthOfTheObstacle) {
        if (lengthOfTheObstacle < MAX_SWIM_DISTANCE) {
            System.out.println(getBreed() + " проплыл " + lengthOfTheObstacle + " м.");
        } else {
            System.out.println("У собак ограничение по плаванию 10 м.");
        }
    }

    public void run(int lengthOfTheObstacle) {
        if (lengthOfTheObstacle < MAX_RUN_DISTANCE) {
            System.out.println(getBreed() + " пробежал " + lengthOfTheObstacle + " м.");
        } else {
            System.out.println("У собак ограничение по бегу 500 м.");
        }
    }

    public static int amountOf() {
        return numberOfDogs;
    }
}
