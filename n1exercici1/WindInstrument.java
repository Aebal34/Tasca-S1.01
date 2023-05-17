package n1exercici1;

public class WindInstrument extends Instrument{

	public WindInstrument(String name, float price) {
		
		super(name, price);
	}
	
	//BLOCK
	{
		play(); //Every time we instantiate the object
	}
	
	//METHODS
	
	static void test() {  //Just to instantiate the class without creating an object
		System.out.println("Pruebas el instrumento. Suena bien.");
	}
	@Override
	public void play() {
		
		System.out.println("Suena un instrumento de viento.");
	}
}
