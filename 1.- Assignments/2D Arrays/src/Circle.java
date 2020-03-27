import java.awt.*;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(int x, int y, Color fillColor, Color lineColor, int radius) {
		
		super(x, y, fillColor, lineColor);
		this.radius = radius;
		
	}

}
