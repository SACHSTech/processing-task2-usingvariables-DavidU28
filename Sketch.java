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
    size(300, 300);
    
  }

  /** 
   * Called once at the beginning of execution.  Add initial setup
   * values here i.e background, stroke, fill, etc.
   */
  public void setup() {
    background(50, 150, 200);
    
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
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
    stroke(0);
    rect((float) (width/4), (float) (height/2), (float) (width/2), (float) (width/3));

    triangle((float) (width/4), (float) (height/2), (float) (width * 0.75), (float) (height/2), (float) (width/2), (float) (height/3));
    fill(255, 50, 50);
    rect((float) (width/2.181818182), (float) (height/1.5), (float) (width/8), (float) (height/6));

    fill(0, 0, 0);
    ellipse((float) (width * 0.55), (float) (height/1.304347826), (float) (width/75), (float) (height/75));

    fill(255);
    rect((float) (width * 0.316666666), (float) (height * 0.55), (float) (width/12.5), (float) (height/12.5));
    fill(0);
    line((float) (width * 0.356666666), (float) (height * 0.55), (float) (width * 0.356666666), (float) (height * 0.63));
    line((float) (width * 0.316666666), (float) (height * 0.59), (float) (width * 0.396666666), (float) (height * 0.59));

  }
}