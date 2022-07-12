import processing.core.PApplet;

public class FourBallsGame extends PApplet {
    public static final int HEIGHT=700;
    public static final int WIDTH=1000;
    public static final int DIAMETER=100;
    private int[] arr;

    public static void main(String[] args) {
        PApplet.main("FourBallsGame",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        arr=new int[4];
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        startGame();
    }

    private void startGame() {
        for(int i=1;i<5;i++)
            drawEllipse(arr,i-1,HEIGHT*i/5,i);
    }

    private void drawEllipse(int[] arr, int index, int height, int speed) {
        ellipse(arr[index],height,DIAMETER,DIAMETER);
        arr[index]+=speed;
    }
}
