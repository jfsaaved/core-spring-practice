package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Circle;
import beans.Rectangle;
import beans.Shape;
import beans.ShapeAware;
import beans.ShapeCenter;
import beans.ShapeChild1;
import beans.ShapeChild2;
import beans.ShapeInheritance;
import beans.Triangle;

public class Main {
	
	  //private static AbstractApplicationContext context;

	public static void main(String[] args) {
		  
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		  
		  //context.registerShutdownHook();	  
		  
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
		  
		  ShapeAware shapeAwareBean = (ShapeAware) context.getBean("shapeaware");
		  shapeAwareBean.draw();
		  
		  ShapeInheritance shapeChild = (ShapeInheritance) context.getBean("inheritchild");
		  shapeChild.draw();
		  
		  ShapeInheritance shapeParent = (ShapeInheritance) context.getBean("inheritparent");
		  shapeParent.draw();
		  
		  ShapeCenter shapeCenter = (ShapeCenter) context.getBean("shapecenter");
		  shapeCenter.draw();
		  
	  }
	  
}
