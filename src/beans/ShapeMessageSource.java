package beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;

public class ShapeMessageSource implements Shape{
	
	private Point center;
	private Point center2;
	@Autowired
	private MessageSource messageSource;

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("-------- DRAWING SHAPE COMPONENT -----------");
		System.out.println("ShapeCenter center is: " + center.getX());
		System.out.println("ShapeCenter center2 is: " + center2.getX());
		System.out.println("Message Source: " + this.messageSource.getMessage("greeting", null, "Default Greeting", null));
	}
	
	public Point getCenter(){
		return center;
	}
	
	@Autowired
	@Qualifier("autowireRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getCenter2() {
		return center2;
	}

	@Resource
	public void setCenter2(Point center2) {
		this.center2 = center2;
	}
	
	@PostConstruct
	public void initializeCircle() {
		System.out.println("Init of Autowire");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of Autowire");
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

}
