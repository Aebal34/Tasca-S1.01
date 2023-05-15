package n2exercici1;

public class App {

	public static void main(String[] args) {
		
		Smartphone smartphone1 = new Smartphone("Samsung", "Note 3");
		
		smartphone1.alarm();
		smartphone1.photograf();
		
		smartphone1.call("697 673 671");
	}
}
