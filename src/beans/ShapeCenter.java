package beans;

import org.springframework.beans.factory.annotation.Required;

public class ShapeCenter implements Shape{
	
	private Point center;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("-------- DRAWING SHAPE CENTER -----------");
		System.out.println("ShapeCenter center is: " + center.getX());
	}
	
	public Point getCenter(){
		return center;
	}
	
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}


}
