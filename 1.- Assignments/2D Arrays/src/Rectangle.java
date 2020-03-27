import java.awt.Color;

public class Rectangle extends Shape{
	
	private int height;
	
    public Rectangle(int x, int y, Color fillColor, Color lineColor, int height) {
		
		super(x, y, fillColor, lineColor);
		this.height = height;
		
	}


}
