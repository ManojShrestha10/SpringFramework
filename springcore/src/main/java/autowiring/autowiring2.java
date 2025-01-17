package autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class autowiring2 {
	private final autowiringExample autowiringexample;

	//Constructor based autowiring 
	public autowiring2(autowiringExample autowiringexample) {
		super();
		this.autowiringexample = autowiringexample;
	}
	
	public void doSomething() {
		autowiringexample.example();
	}
	
	
	

}
