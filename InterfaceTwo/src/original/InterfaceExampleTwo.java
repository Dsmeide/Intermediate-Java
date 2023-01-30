package original;



interface computer {
	String brand = "Dell";
	String type = "Laptop";
	
	void powerOn();
	void powerOff();
	void reset();
	String powerButton(String action);
	
}

public class InterfaceExampleTwo implements computer {
	
	String on = "On";
	String off = "Off";
	String reset ="Reset";
	
	@Override
	public void powerOn() {
		System.out.println("Computer is on");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Computer is off");
		
	}
	
	@Override
	public void reset() {
		System.out.println("Reset!");
		
	}

	@Override
	public String powerButton(String action) {
		if(action.equalsIgnoreCase(on)) {
			this.powerOn();
			return "On";
		} else if(action.equalsIgnoreCase(off)) {
			this.powerOff();
			return "Off";
		} else if(action.equalsIgnoreCase(reset)) {
			this.reset();
			return "Reset";
		} else {
			System.out.println("invalid input");
			return "invalid";
		}
		
	}

	
}
