package autowiringPratice1;

public class autowiring2 {
	private final autowiring1 Autowiring1;

	public autowiring2(autowiring1 Autowiring1) {
		super();
		this.Autowiring1 = Autowiring1;
	}
	
	public void display() {
		Autowiring1.auto();
	}

}
