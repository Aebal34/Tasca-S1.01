package n1exercici1;

public class StringInstrument extends Instrument{

	public StringInstrument(String name, float price) {
		
		super(name, price);
	}
	
	public void play() {
		
		System.out.println("Suena un instrumento de cuerda.");
	}
}
