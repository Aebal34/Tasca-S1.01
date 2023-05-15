package n1exercici2;

public class App {

	public static void main(String[] args) {
		
		//We can access static methods without instantiating the class
		
		Car.brake();
		
		//When we instantiate the class, both static attributes are declared, one of them not being able to be modified because it's final
		
		Car kiaStonic = new Car(1400);
		
		//Now we can access to the non-static methods of the class with the object created
		
		kiaStonic.accelerate();

	}

}
