import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallOOPS extends PApplet
{
    public static final int HEIGHT=700;
    public static final int WIDTH=1000;
    public static final int DIAMETER=100;

    List<Game> games=new ArrayList<>();
    List<Float> heights=new ArrayList<>();
    List<Integer> speeds=new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("FourBallsGame",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
        intiateGame();
    }

    private void intiateGame() {
        for(int i=1;i<=4;i++){
            heights.add((float) (HEIGHT*i/5));
            speeds.add(i);
        }
        for(int i=0;i<4;i++)
            games.add(new Game(heights.get(i) , 0));

    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        for(int i=0;i<4;i++){
            Game game=games.get(i);
            ellipse(game.height,speeds.get(i),DIAMETER,DIAMETER);
            game.updateGame(speeds.get(i));
        }
    }
}
