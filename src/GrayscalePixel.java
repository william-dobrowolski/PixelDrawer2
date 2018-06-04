import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Vector2f;

public class GrayscalePixel {
	//Variables
	private float x;
	private float y;
	private float greyValue;
	public Color color;
	
	//Constructors
	public GrayscalePixel() {
		//top left corner
		this.x = 0;
		this.y = 0;
		this.greyValue = 0;
		this.color = Color.black;
	}
	
	public GrayscalePixel(float x, float y, float greyValue) {
		this.x = x;
		this.y = y;
		this.greyValue = greyValue;
	}
	
	//Getters
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	//Setters
	public void setX(float x) {
		this.x = x;
	}
	
	public void setY(float y) {
		this.y = y;
	}
	
	//Draw Graphics
	public void drawer(Graphics gc, int colored){
		gc.setColor(makeRGB(colored));
		gc.fillRect(this.x, this.y, 1, 1);
		gc.flush();
	}
	
	//Converts gray value into rgb for drawing
	public Color makeRGB(int gray){
		return new Color(gray, gray, gray);
	}
	
}
