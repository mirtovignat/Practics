package prac2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.5, 2.5);
        System.out.println(ball);
        ball.move(2.0, -1.0);
        System.out.println("После движения: " + ball);
    }
}