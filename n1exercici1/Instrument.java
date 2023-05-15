package n1exercici1;

public abstract class Instrument {

	//ATRIBUTES
	
	protected String name;
	protected float price;
	
	//CONSTRUCTOR
	
	protected Instrument(String name, float price) {
		
		this.name = name;
		this.price = price;
	}
	//METHODS
	
	protected abstract void play();
}
