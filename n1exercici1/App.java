package n1exercici1;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Antes de crear tambor");
		
		PercussionInstrument drum = new PercussionInstrument("drum", 79.95f);
		
		System.out.println("Después de crear tambor");
		
		System.out.println("Test de guitarra.");
		
		StringInstrument.test();
		
		System.out.println("Test de flauta.");
		
		WindInstrument.test();
		
		System.out.println("Antes de crear flauta");
		
		WindInstrument flute = new WindInstrument("flute", 29.95f);
		
		System.out.println("Después de crear flauta");

	}

}
