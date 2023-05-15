package n1exercici1;

public class App {

	public static void main(String[] args) {
		
		PercussionInstrument.test();
		
		System.out.println("Antes de crear objeto");
		
		PercussionInstrument drum = new PercussionInstrument("drum", 79.95f);
		
		System.out.println("Después de crear objeto");
		System.out.println("Antes de crear objeto");
		
		PercussionInstrument drum2 = new PercussionInstrument("drum", 79.95f);
		
		System.out.println("Después de crear objeto");
		
		drum.play();
		
		drum2.play();

	}

}
