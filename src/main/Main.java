package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Circle;
import beans.Rectangle;
import beans.Shape;
import beans.ShapeChild1;
import beans.ShapeChild2;
import beans.Triangle;

public class Main {
	
	  public static void main(String[] args) {
		  
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
				  
		  Triangle triangleBean = (Triangle) context.getBean("triangle");
		  triangleBean.draw();
		  
		  Circle circleBean = (Circle) context.getBean("circle");
		  circleBean.draw();
		  
		  Rectangle rectangleBean = (Rectangle) context.getBean("rectangle");
		  rectangleBean.draw();
		  
		  ShapeChild1 shapeChild1Bean = (ShapeChild1) context.getBean("shapechild1");
		  shapeChild1Bean.draw();
		  
		  ShapeChild2 shapeChild2Bean = (ShapeChild2) context.getBean("shapechild2");
		  shapeChild2Bean.draw();
		  
	  }
	  
}
