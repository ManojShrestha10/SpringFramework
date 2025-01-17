package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
		 
		 autowiring2 autoWiring2 = (autowiring2) context.getBean("autowiring2");
		 
		 autoWiring2.doSomething();
	}

}
