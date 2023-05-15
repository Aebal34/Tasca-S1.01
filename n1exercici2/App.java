package n1exercici2;

public class App {

	public static void main(String[] args) {
		
		//We can access static methods without instantiating the class
		
		Car.brake();
		
		//When we instantiate the class, both static attributes are declared, one of them not being able to be modified because it's final
		
		Car kiaStonic = new Car(1400);
		System.out.println(kiaStonic);
		
		//Now we can access to the non-static methods of the class with the object created
		
		kiaStonic.accelerate();
		
		//If we create a new car, it will maintain it's static elements, brand and model, but we can initialize again it's power
		
		Car kiaStonic2 = new Car(1200);
		System.out.println(kiaStonic2);
		
		//If we change the model in the class, it changes for every object from that class
		
		Car.setModel("Sportage");
		System.out.println(kiaStonic);
		System.out.println(kiaStonic2);

	}

}
