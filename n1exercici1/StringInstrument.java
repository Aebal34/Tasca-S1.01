package n1exercici1;

public class StringInstrument extends Instrument{

	public StringInstrument(String name, float price) {
		
		super(name, price);
	}
	
	//STATIC BLOCK
	
	static {
		System.out.println("Pruebas el instrumento.");
	}
	
	//METHODS
	
	static void test() {  //Just to instantiate the class without creating an object
		System.out.println("Suena bien.");
	}
	
	public void play() {
		
		System.out.println("Suena un instrumento de cuerda.");
	}
}
