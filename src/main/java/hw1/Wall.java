package hw1;

public class Wall implements Obstacle {
    int height;
    String name;


    public int getHeight() {
        return height;
    }

    @Override
    public int getDistance() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }

    public Wall(int height, String name) {
        this.height = height;
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println(" через стену " + this.name + " высотой " + this.height);
        System.out.println();
    }
}