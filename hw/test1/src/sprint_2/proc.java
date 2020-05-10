package sprint_2;

import processing.core.PApplet;

public class proc extends PApplet {
    public static void main(String[] args) {
        PApplet.main("sprint_2.proc");
    }
    public void settings(){
        size(100, 100);
    }

    // identical use to setup in Processing IDE except for size()
    public void setup(){
        background(255);
//        frameRate(10);
    }

    // identical use to draw in Prcessing IDE
    public void draw(){
        for (int i=0;i<=width;i=i+10){
            for (int j=0;j<=height;j=j+10) {
            strokeWeight(10);

//            stroke(random(0,255),random(0,255),random(0,255));
                stroke(random(0, 255));
                point(i, j);
            }
        }
    }


}
