package task2_competition.obstacles;

import task2_competition.participants.Participant;

public class Wall implements Obstacle {
    private final int jumpHeight;

    public Wall(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean overcomeBy(Participant participant) {
        return participant.jump(jumpHeight, this.getClass().getSimpleName());
    }
}
