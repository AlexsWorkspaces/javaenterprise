package task2_competition;

import task2_competition.obstacles.Obstacle;
import task2_competition.obstacles.Track;
import task2_competition.obstacles.Wall;
import task2_competition.participants.Cat;
import task2_competition.participants.Human;
import task2_competition.participants.Participant;
import task2_competition.participants.Robot;

public class Competition {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Usain Bolt", 100,2),
                new Cat("Barsik", 10, 3),
                new Robot("Wally", 50,0.5)
        };

        Obstacle[] obstacles = {
                new Track(25),
                new Wall(1)
        };

        start(participants, obstacles);

    }
    static void start(Participant[] participants, Obstacle[] obstacles){
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
               if (!obstacles[j].overcomeBy(participants[i])) {
                   System.out.println("The participant " + participants[i].getName() + " is eliminated from the competition");
                   break;
               }
            }
        }
    }
}
