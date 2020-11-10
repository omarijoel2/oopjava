package guimodule;
import processing.core.PApplet;
import processing.core.PImage;
public class MyPApplet {
	PImage img;
	
	public void setup() {
		//Add setup code for MyApplet
		
		size(400,400);  //set canvas size
		background(255); //set canvas color
		stroke(0);  //set pen color
		img= loadImage("http://cseweb.ucsd.edu/~minnes/palmTress", "jpg");
		img.resize(0, height); //resize loaded image to full height of canvas
		image(img, 0,0); //display image
		
	}
	
	public void draw() {
		//Add drawing code for MyApplet
		
		int[] color= sunColorSec(second()); //calculate color code for sun position
		fill(color[0], color[1], color[2]); //set sun color
		ellipse(width/4, height/5, with/4, height/5); //draw sun
	}
public int[] sunColorSec(float seconds) {
	
	int[] rgb= new int[3];
	//scale the brightness of the yellow based on the seconds
	//0 seconds is blac, 30 seconds is bright yellow.
	
	float diffFrom30 = Math.abs(30-seconds);
	
	float ratio = diffFrom30/30;
	rgb[0]= (int)(255*ratio);
	rgb[1] = (int)(255*ratio);
	rgb[2]=0;
}
}
