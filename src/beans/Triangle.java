package beans;

public class Triangle implements Shape{
	
	private String type;
	
	public Triangle (String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void draw() {
		System.out.println(this.type + " drawn!");
	}

}
