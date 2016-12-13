package beans;

public class ShapeInheritance implements Shape{
	
	private Point pointA;
	private Point pointB;
	
	
	@Override
	public void draw() {
		System.out.println("ShapeChild2 X: " + this.pointA.getX() + ", " + this.pointB.getX());
		System.out.println("ShapeChild2 Y: " + this.pointA.getY() + ", " + this.pointB.getY());
	}



	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

}
