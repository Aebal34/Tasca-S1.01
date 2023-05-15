package n2exercici1;

public class Smartphone extends Phone implements Camera, Watch{

	//CONSTRUCTOR
	
	public Smartphone(String brand, String model) {
		super(brand, model);
	}
	
	//METHODS
	
	public void photograf() {
		System.out.println("Se está haciendo una foto.");
	}
	
	public void alarm() {
		System.out.println("Está sonando la alarma.");
	}
}
