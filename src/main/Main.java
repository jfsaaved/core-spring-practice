package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Circle;
import beans.Shape;
import beans.Triangle;

public class Main {
	
	  public static void main(String[] args) {
		  
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
				  
		  Triangle triangleBean = (Triangle) context.getBean("triangle");
		  triangleBean.draw();
		  
		  Circle circleBean = (Circle) context.getBean("circle");
		  circleBean.draw();
		  
	  }
}
