import processing.core.PApplet;

public class Sketch extends PApplet {

  // Generates a random number from -190 and 100 and -150 and 120

  float circleX = random(-190,100);
  float circleY = random(-150,120);

  // 

  String currentTime;
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  // Defaultbackground colour

  public void setup() {
    background(210, 255, 173);


  }
public void draw() {

    // checks if the circle will be shown on the top or bottom half of the screen 
     

    double greaterY;
    greaterY = 150 - (circleY);

    boolean isGreaterY = greaterY > 200;

    // checks if the circle will be shown on the left or right side of the screen 

    double greaterX;
    greaterX = 150 - (circleX);

    boolean isGreaterX = greaterX > 200;

    boolean isGreaterXY = isGreaterX && isGreaterY;

    // if the circle appears in the bottom-right side of the screen then the background changes to red 

    if (isGreaterXY) {

      background(255,60,0);
    }

     /**
   * Called repeatedly, anything drawn to the screen goes here
   */

    // each x and y cordinates of each shape is either subtracted or added with the randomly generated mumber 

   
  fill(228,161,62); 
  ellipse(150 - (circleX),150 - (circleY),200,200);

  fill(204,102,0);
  ellipse(135 - (circleX),150- (circleY),20,20);

  fill(204,102,0);
  ellipse(165 - (circleX),150- (circleY),20,20);


  rect(120 - (circleX),165- (circleY),60,10);


  // shows current time in 24 hr format 


  fill(0);
  textSize(34);
  currentTime = hour() + ":" + minute();
  text(currentTime, 150, 50);





   
  }
  
  
}