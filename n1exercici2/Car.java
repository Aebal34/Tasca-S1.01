package n1exercici2;

public class Car {

	//ATRIBUTES
	
	private static final String brand = "Kia";
	private static String model;
	private final int power;
	
	//STATIC BLOCK
	
	static {
		System.out.println("The model is "+model);
		model="Stonic";
		System.out.println("The model is "+model);
	}
	
	//CONSTRUCTOR
	
	public Car(int power) {
		
		this.power = power;
	}
	
	//GETTERS
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getPower() {
		return power;
	}
	
	//SETTERS
	
	public static void setModel(String newModel) {
		model = newModel; 
	}
	
	//METHODS
	
	static void brake() {
		System.out.println("El vehículo está frenando.");
	}
	
	public void accelerate() {
		System.out.println("El vehículo está acelerando.");
	
	}
	
}
