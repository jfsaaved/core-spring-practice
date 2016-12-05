package main;

import org.joda.time.LocalTime;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import beans.Triangle; 

public class Main {
	
	  public static void main(String[] args) {
		  
		  ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		  BeanFactory factory = context;
		  Triangle triangleBean = (Triangle) factory.getBean("triangle");
		  triangleBean.draw();

	  }
}
