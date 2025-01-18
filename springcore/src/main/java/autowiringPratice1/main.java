package autowiringPratice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");
		
		autowiring2 autowiring = (autowiring2) context.getBean("autowiring2");
		
		autowiring.display();

	}

}
