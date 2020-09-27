package hw1;


public class Race {

        public void race (Athlete[]athletes, Obstacle []obstacles){
            for (Athlete athlete : athletes) {
                for (Obstacle obstacle : obstacles) {
                    if (athlete.isReady()) {
                        if (obstacle instanceof Wall) {
                            athlete.jump(obstacle);
                            if (obstacle.getHeight() > athlete.getHeight()) {
                                System.out.println(athlete.getName() + " не перепрыгнул т.к. стена высотой, " + obstacle.getHeight() + " a атлет прыгнул на " + athlete.getHeight());
                                athlete.setReady(false);
                            }
                        }
                        if (obstacle instanceof Runningtrack) {
                            athlete.run(obstacle);
                            if (obstacle.getDistance() > athlete.getDistance()) {
                                System.out.println(athlete.getName() + " не пробежал т.к. дорога длиной, " + obstacle.getDistance() + " a атлет пробежал  " + athlete.getDistance());
                                athlete.setReady(false);
                            }
                        }
                    }
                }
            }
        }
    }
