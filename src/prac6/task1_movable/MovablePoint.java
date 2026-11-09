package prac6;

public class MovablePoint implements Movable {
    protected int coordinateX;
    protected int coordinateY;
    protected int speedX;
    protected int speedY;

    public MovablePoint(int coordinateX, int coordinateY, int speedX, int speedY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    @Override
    public void moveUp() {
        coordinateY -= speedY;
    }

    @Override
    public void moveDown() {
        coordinateY += speedY;
    }

    @Override
    public void moveLeft() {
        coordinateX -= speedX;
    }

    @Override
    public void moveRight() {
        coordinateX += speedX;
    }

    @Override
    public String toString() {
        return "MovablePoint{x=" + coordinateX + ", y=" + coordinateY + "}";
    }
}