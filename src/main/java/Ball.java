import processing.core.PApplet;

public class Ball {

    int distanceTravelled;

    Ball(int distanceTravelled){
        this.distanceTravelled=distanceTravelled;
    }

    public void moveBall(int speed){
        this.distanceTravelled+=speed;
    }
}
