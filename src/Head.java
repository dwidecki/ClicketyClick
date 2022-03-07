import java.awt.Color;

import wheels.users.Ellipse;

public class Head {

	private Ellipse face;
	private Ellipse eye1;
	private Ellipse eye2;
	
	public Head(int x, int y) {
		face = new Ellipse();
		face.setColor(Color.red);
		face.setSize(100, 100);
		
		eye1 = new Ellipse();
		eye1.setColor(Color.black);
		eye1.setSize(10, 10);
		
		eye2 = new Ellipse();
		eye2.setColor(Color.black);
		eye2.setSize(10, 10);
		
		setLocation(x, y);
	}
	
	public void setLocation(int x, int y) {
		face.setLocation(x, y);
        eye1.setLocation(face.getXLocation() + 30, face.getYLocation() + 30); 
        eye2.setLocation(face.getXLocation() + 60, face.getYLocation() + 30);
	}
	
}
