package beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape, InitializingBean, DisposableBean{
	
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
	
	@Override
	public void draw() {
		System.out.println(this.type + " of size "+ this.size +" drawn. ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.type + " Initialized");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(this.type + " Finished");
	}

}
