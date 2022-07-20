import processing.core.PApplet;

public class FourBallsUsingOOPs extends PApplet {
    public static final int HEIGHT = 700;
    public static final int WIDTH = 1000;
    public static final int DIAMETER = 100;

    public static final int numberOfBalls = 4;

    private Ball[] balls;

    public static void main(String[] args) {
        PApplet.main("FourBallsGame", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    private void initiateBalls() {
        balls = new Ball[numberOfBalls];
        for (int i = 0; i < numberOfBalls; i++)
            balls[i] = new Ball(0);
    }

    @Override
    public void setup() {
        initiateBalls();
    }

    @Override
    public void draw() {
        drawBalls();
    }

    private void drawBalls() {
        for (int unit = 1; unit<= numberOfBalls; unit++) {
            float y_axis= (float)height*unit/5;
            Ball ball = balls[unit];
            ellipse(unit,y_axis, DIAMETER, DIAMETER);
            ball.moveBall(unit);
        }
    }
}