package lesson170625.creation;

public class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int y) {
        this(0,y);
    }
}
