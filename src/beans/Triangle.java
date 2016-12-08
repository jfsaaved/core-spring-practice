package beans;

public class Triangle implements Shape{
	
	private String type;
	private int size;
	
	public Triangle (String type){
		this.type = type;
	}
	
	public Triangle (String type, int size) {
		this.type = type;
		this.size = size;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void draw() {
		System.out.println(this.type + " of size "+ this.size +" drawn. ");
	}

}
