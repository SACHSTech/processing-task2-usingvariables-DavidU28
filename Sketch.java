import processing.core.PApplet;
 /**
   * A program processing.core uses processing variables like width and height to make a drawing that is dynamic to changes in size
   * @author: D. Ursu
   *
   */

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial setup
   * values here i.e background, stroke, fill, etc.
   */
  public void setup() {
<<<<<<< HEAD
    background(50, 150, 200);
=======
    background(255);
>>>>>>> origin/main
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
<<<<<<< HEAD
	  
	  // Grass
    fill(100, 250 , 50);
    stroke(0);
    rect(0, (float) (height/1.2), width, height);

    // Sun
    fill(255, 255, 0);
    stroke(0);
    ellipse((float) (width/30), (float) (height/20), (float) (width/3), (float) (height/3));

    // House
    fill(96, 130, 182);
=======

  // Quadrant 1 (10 x 10 Grid)

>>>>>>> origin/main
    stroke(0);
    
    for(int lineX = width/20; lineX < width/2; lineX+= width/20){
      line(lineX, 0, lineX, height/2);
    }

<<<<<<< HEAD
    triangle((float) (width/4), (float) (height/2), (float) (width*0.75), (float) (height/2), (float) (width/2), (float) (height/3));
    fill(255, 50, 50);
    rect((float) (width/2.181818182), (float) (height/1.5), (float)(width/8), (float) (height/6));
=======
    for(int lineY = height/20; lineY < height/2; lineY+= height/20){
      line(0, lineY, width/2, lineY);
    }

  // Quadrant 2 (5 x 5 grid of evenly spaced circles)
       
    for (int circleY = height/20; circleY <= height/2 - height/20; circleY += height/10) {
    for (int circleX = width/2 + width/20; circleX <= width; circleX += width/10 ) {
      ellipse(circleX, circleY, width/20, height/20);
      fill(128, 128, 128);
      
      }
    }
>>>>>>> origin/main

  // Quadrant 3 is a horizontal grayscale gradient
    
   for (int i = 0; i <= width/2; i++) {
    stroke(i);
    line(i, height/2, i, height);
     
 }
    
  // Quadrant 4 is a 8 petal flower that uses a loop to draw the petals evenly spaced around the center of the flower.
   
      fill(255, 0, 0);
    
    pushMatrix();
      translate((float)(width * 0.78), (float)(height * 0.6875));
    
    for (int i = 0; i <= 8; i++) {
      rotate (TWO_PI / 8);
      translate(width/16, 0);
      ellipse(0, 0, width/16, height/8);
    }
     popMatrix(); 

    fill(255, 255, 0);
    ellipse((float) (width * 0.75), (float) (height * 0.76), width/10, height/10);

 
    
  }
  
}