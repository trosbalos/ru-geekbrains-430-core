package hw1;

public class Human implements Athlete {
    int distance;
    int height;
    String name;
    boolean isReady;

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    public int getHeight() {
        return height;
    }

    public Human(int distance, int height, String name,boolean isReady) {
        this.distance = distance;
        this.height = height;
        this.name = name;
        this.isReady = isReady;
    }

    public void run(Obstacle obstacle) {
        if (obstacle.getDistance() <= this.distance) {
            System.out.println(this.name + " пробежал " + obstacle.getName());
        } else System.out.println(this.name + " не пробежал " + obstacle.getName());
    }

    public void jump(Obstacle obstacle) {
        if (obstacle.getHeight() <= this.height) {
            System.out.println(this.name + " перепрыгнул " + obstacle.getName());
        } else System.out.println(this.name + " не перепрыгнул " + obstacle.getName());
    }


}