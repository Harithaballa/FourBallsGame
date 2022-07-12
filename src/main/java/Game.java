import processing.core.PApplet;

public class Game extends PApplet {

    float  height;
    int distanceTravelled;

    Game(){

    }

    Game(float height,int distanceTravelled){
        this.height=height;
        this.distanceTravelled=distanceTravelled;
    }

    public void updateGame(int speed){
        this.distanceTravelled+=speed;
    }
}
