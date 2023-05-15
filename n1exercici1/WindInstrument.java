package n1exercici1;

public class WindInstrument extends Instrument{

	public WindInstrument(String name, float price) {
		
		super(name, price);
	}
	
	public void play() {
		
		System.out.println("Suena un instrumento de viento.");
	}
}
