package beans;

import java.util.List;

public class ShapeChild1 implements Shape {
	
	private List<Point> points;
	

	@Override
	public void draw() {
	
		for(Point point : points){
			System.out.println("Shape Child Point = (" + point.getX() + ", " + point.getY() + ")");
		}
		
	}


	public List<Point> getPoints() {
		return points;
	}


	public void setPoints(List<Point> points) {
		this.points = points;
	}

}
