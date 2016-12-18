package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class ShapeAutowire implements Shape {
	
	private Point center;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("-------- DRAWING SHAPE AUTOWIRE -----------");
		System.out.println("ShapeCenter center is: " + center.getX());
	}
	
	public Point getCenter(){
		return center;
	}
	
	@Autowired
	@Qualifier("autowireRelated")
	public void setCenter(Point center) {
		this.center = center;
	}


}
