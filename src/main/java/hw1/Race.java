package hw1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Race {
    ///test
    public static <arrayList> void main(String[] args) {

        Cat boris = new Cat(4, 9, "boris");
        Cat gulfik = new Cat(3, 9, "gulfik");
        Cat pauk = new Cat(7, 3, "pauk");
        Robot term1 = new Robot(5, 2, "term1");
        Robot term2 = new Robot(4, 3, "term2");
        Robot term3 = new Robot(4, 0, "term3");
        Human kolya = new Human(4, 3, "kolya");
        Human bolt = new Human(100, 9, "bolt");
        Human vasya = new Human(4, 5, "vasya");
        Wall wall1 = new Wall(5, "wall1");
        Wall wall2 = new Wall(2, "wall2");
        Wall wall3 = new Wall(8, "wall3");
        Runningtrack track1 = new Runningtrack(9, "track1");
        Runningtrack track2 = new Runningtrack(2, "track2");
        Runningtrack track3 = new Runningtrack(8, "track3");


//
//        ArrayList<Athlete> athletes = new ArrayList<Athlete>();
//        athletes.add(boris);
//        athletes.add(gulfik);
//        athletes.add(pauk);
//        athletes.add(term1);
//        athletes.add(term2);
//        athletes.add(term3);
//        athletes.add(kolya);
//        athletes.add(vasya);
//        athletes.add(bolt );
        Athlete[] athletes = {boris, gulfik, pauk, term1, term2, term3, kolya, vasya, bolt};
        Obstacle[] obstacles = {wall1, wall2, wall3, track1, track2, track3};


        for (Athlete athlete : athletes) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    athlete.jump(obstacle);
                    if (obstacle.getHeight() > athlete.getHeight()) {
                        System.out.println(athlete.getName() + " не перепрыгнул т.к. стена высотой, " + obstacle.getHeight() + " a атлет прыгнул на " + athlete.getHeight());
                        break;
                    }
                }
                if (obstacle instanceof Runningtrack) {
                    athlete.run(obstacle);
                    if (obstacle.getDistance() > athlete.getDistance()) {
                        System.out.println(athlete.getName() + " не пробежал т.к. дорога длиной, " + obstacle.getDistance() + " a атлет пробежал  " + athlete.getDistance());

                        break;
                    }
                }
            }
        }
    }
}