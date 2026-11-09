package prac6;

public class MovableCircle implements Movable {
    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int coordinateX, int coordinateY, int speedX, int speedY, int radius) {
        this.center = new MovablePoint(coordinateX, coordinateY, speedX, speedY);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle{center=" + center + ", radius=" + radius + "}";
    }
}