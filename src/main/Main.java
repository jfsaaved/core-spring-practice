package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Shape;

public class Main {
	
	  public static void main(String[] args) {
		  
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		  Shape triangleBean = (Shape) context.getBean("triangle");
		  triangleBean.draw();

	  }
}
