package n2exercici1;

public class Phone {

	protected String brand;
	protected String model;
	
	//CONSTRUCTOR
	
	protected Phone(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	//METHODS
	
	protected void call(String number) {
		
		System.out.println("Se está llamando al número "+number);
	}
}
