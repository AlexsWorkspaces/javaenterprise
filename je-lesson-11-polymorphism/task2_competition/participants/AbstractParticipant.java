package task2_competition.participants;

public abstract class AbstractParticipant implements Participant {
    private final String name;
    private final int maxSprintDistance;
    private final double maxJumpHeight;

    public AbstractParticipant(String name, int maxSprintDistance, double maxJumpHeight) {
        this.name = name;
        this.maxSprintDistance = maxSprintDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxSprintDistance() {
        return maxSprintDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }
}
