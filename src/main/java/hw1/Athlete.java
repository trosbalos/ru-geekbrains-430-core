package hw1;

public interface Athlete {

    void run(Obstacle obstacle);

    void jump(Obstacle obstacle);

    int getDistance();

    int getHeight();

    String getName();


}