package hw1;

public class Cat implements Athlete {
    int distance;
    int height;
    String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDistance() {
        return distance;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public Cat(int distance, int height, String name) {
        this.distance = distance;
        this.height = height;
        this.name = name;
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