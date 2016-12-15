package beans;

public class Rectangle implements Shape{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private String type;
	
	public String getType(){
		return this.type;
	}
	
	public void setType(String type){
		this.type = type;
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
	
	public Point getPointC() {
		return pointC;
	}
	
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void draw() {
		System.out.println(this.type + " X for points A, B, and C: " + this.pointA.getX() + ", " + this.pointB.getX() + ", " + this.pointC.getX());
		System.out.println(this.type + " Y for points A, B, and C: " + this.pointA.getY() + ", " + this.pointB.getY() + ", " + this.pointC.getY());
	}
	
	
	public void myInit() {
		System.out.println(this.type + " Initialized");
	}
	
	public void cleanUp() {
		System.out.println(this.type + " Finished");
	}
	

}
