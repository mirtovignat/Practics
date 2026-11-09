package prac6;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int coordinateX1, int coordinateY1, int coordinateX2, int coordinateY2, int speedX, int speedY) {
        this.topLeft = new MovablePoint(coordinateX1, coordinateY1, speedX, speedY);
        this.bottomRight = new MovablePoint(coordinateX2, coordinateY2, speedX, speedY);
    }

    public boolean isSpeedEqual() {
        return topLeft.speedX == bottomRight.speedX && topLeft.speedY == bottomRight.speedY;
    }

    @Override
    public void moveUp() {
        if (isSpeedEqual()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (isSpeedEqual()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveLeft() {
        if (isSpeedEqual()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public void moveRight() {
        if (isSpeedEqual()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{topLeft=" + topLeft + ", bottomRight=" + bottomRight + "}";
    }
}