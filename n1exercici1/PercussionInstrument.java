package n1exercici1;

public class PercussionInstrument extends Instrument{
	
	//CONSTRUCTOR
	public PercussionInstrument(String name, float price) {
		
		super(name, price);
	}
	
	//STATIC METHOD
	static void test(){
		System.out.println("Static method.");
	}
	
	//STATIC BLOCK 
	static{
		System.out.println("Static block.");
	}
	
	//BLOCK
	{
		System.out.println("Every time we instantiate the class");
	}
	
	//METHOD
	public void play() {
		
		System.out.println("Suena un instrumento de percusión.");
	}
}
