package task2_competition.obstacles;

import task2_competition.participants.Participant;

public class Track implements Obstacle {
    private final int distance;

    public Track(int lengthOfTrack) {
        this.distance = lengthOfTrack;
    }

    @Override
    public boolean overcomeBy(Participant participant) {
        return participant.run(distance, this.getClass().getSimpleName());
    }
}
