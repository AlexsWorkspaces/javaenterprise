package task2_competition.participants;

public interface Participant {
    String getName();

    int getMaxSprintDistance();

    double getMaxJumpHeight();

    //Стоит вынести реализацию дефолтных методов в абстрактный класс? Сделала по заданию в интерфейсе
    default boolean run(int distance, String nameOfTheObstacle) {
        if (getMaxSprintDistance() >= distance) {
            System.out.println(
                    "Participant " + getName() + " completed the obstacle " +
                            nameOfTheObstacle + " on the course " + distance);
            return true;
        } else {
            System.out.println(
                    "Participant " + getName() + " failed the obstacle " +
                            nameOfTheObstacle + " on the course " + distance +
                            ". Completed " + getMaxSprintDistance());
            return false;
        }
    }

    default boolean jump(double jumpHeight, String nameOfTheObstacle) {
        if (getMaxJumpHeight() >= jumpHeight) {
            System.out.println(
                    "Participant " + getName() + " completed the obstacle " +
                            nameOfTheObstacle + " on the course " + jumpHeight);
            return true;
        } else {
            System.out.println(
                    "Participant " + getName() + " failed the obstacle " +
                            nameOfTheObstacle + " on the course " + jumpHeight +
                            ". Completed " + getMaxJumpHeight());
            return false;
        }
    }
}
