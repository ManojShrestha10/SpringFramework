package lazyInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("lazy.xml");
		//not lazy bean is initialized on context startup
		System.out.println("Spring context initialized");
		
		//lazy bean is initialized only when it is requested
		lazy lazyBean = (lazy) context.getBean("lazy");
		
		System.out.println("Lazy bean requested"  + lazyBean.getName());
}
	
}
