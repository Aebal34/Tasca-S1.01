package n1exercici1;

public class PercussionInstrument extends Instrument{
	
	//CONSTRUCTOR
	public PercussionInstrument(String name, float price) {
		
		super(name, price);
	}
	
	//BLOCK
	{
		play(); //Every time we instantiate the object
	}
	
	//METHOD
	@Override
	public void play() {
		
		System.out.println("Suena un instrumento de percusión.");
	}
}
