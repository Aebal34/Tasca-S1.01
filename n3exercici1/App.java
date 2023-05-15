package n3exercici1;
import java.util.ArrayList;
public class App {

	static ArrayList<Redactor> redactors = new ArrayList<Redactor>();
	public static void main(String[] args) {
		
		//VARIABLES
		boolean flag = false;
		int redactorIndex;
		int newsIndex;
		String dni;
		
		//PROGRAM
		while(!flag) {
			switch(mainMenu()) {
				case 1: //Create redactor
					dni = Teclado.leerString("Introduzca el DNI del redactor/a");
					if(!dniExists(dni)) {
						addRedactor(new Redactor(Teclado.leerString("Introoduzca el nombre del redactor/a: "), dni));
						System.out.println("El/La redactor/a ha sido añadido con éxito.");
						System.out.println("");
					}else {
						System.out.println("El dni introducido ya existe en la base de datos. Pruebe de nuevo.");
						System.out.println("");
					}

					break;
				case 2: //Remove redactor
					redactorIndex = findRedactor(Teclado.leerString("Introduzca el DNI del redactor/a a eliminar:"));
					if(redactorIndex >= 0) {
						removeRedactor(redactorIndex);
						System.out.println("El/La redactor/a con DNI "+redactors.get(redactorIndex).getDni()+" ha sido eliminado/a con éxito.");
						System.out.println("");
					}else {
						System.out.println("No se ha encontrado el/la redactor/a.");
						System.out.println("");
					}
					break;
				case 3: //Add news to redactor
					redactorIndex = findRedactor(Teclado.leerString("Introduzca el DNI del redactor/a:"));
					if(redactorIndex >= 0) {
						addNewsSelection(redactorIndex, Teclado.leerString("Introduzca el titular de la noticia:"));
						System.out.println("La noticia ha sido añadida con éxito");
						System.out.println("");
					}else {
						System.out.println("No se ha encontrado el/la redactor/a.");
						System.out.println("");
					}
					break;
				case 4: //Remove news from redactor
					redactorIndex = findRedactor(Teclado.leerString("Introduzca el DNI del redactor/a:"));
					if(redactorIndex >= 0) {
						redactors.get(redactorIndex).removeNews(Teclado.leerString("Introduzca el titular de la noticia a eliminar:"));
						System.out.println("La noticia ha sido eliminada con éxito");
						System.out.println("");
					}else {
						System.out.println("No se ha encontrado el/la redactor/a.");
						System.out.println("");
					}
					break;
				case 5: //Show news from all redactors
					if(redactors.size() >= 0) {
						for(int i=0; i<redactors.size(); i++) {
							redactors.get(i).showNews();
						}
					}
					break;
				case 6: //Calculate price from news
					redactorIndex = findRedactor(Teclado.leerString("Introduzca el DNI del redactor/a de la noticia:"));
					if(redactorIndex >= 0) {
						newsIndex = redactors.get(redactorIndex).findNews(Teclado.leerString("Introduzca el titular de la noticia:"));
						if(newsIndex >= 0) {
							System.out.println("La noticia vale: "+redactors.get(redactorIndex).getNews().get(newsIndex).calculatePriceNews()+"€.");
							System.out.println("");
						}else {
							System.out.println("No se ha encontrado la noticia.");
							System.out.println("");
						}
					}else {
						System.out.println("No se ha encontrado el/la redactor/a.");
						System.out.println("");
					}
					break;
				case 7: //Calculate score from news
					redactorIndex = findRedactor(Teclado.leerString("Introduzca el DNI del redactor/a de la noticia:"));
					if(redactorIndex >= 0) {
						newsIndex = redactors.get(redactorIndex).findNews(Teclado.leerString("Introduzca el titular de la noticia:"));
						if(newsIndex >= 0) {
							System.out.println("La noticia vale: "+redactors.get(redactorIndex).getNews().get(newsIndex).calculateScoreNews()+" puntos.");
							System.out.println("");
						}else {
							System.out.println("No se ha encontrado la noticia.");
							System.out.println("");
						}
					}else {
						System.out.println("No se ha encontrado el/la redactor/a.");
						System.out.println("");
					}
					break;
				case 0: //Exit
					flag = true;
					break;
				default:
					System.out.println("Error. Introduzca una opción válida.");
					System.out.println("");
					break;
			}
		}
	}

	//INTERFACE
	
	static byte mainMenu() {
		return Teclado.leerByte("1. Crear redactor/a."+"\n"
							   +"2. Eliminar redactor/a."+"\n"
							   +"3. Introducir noticia a redactor/a."+"\n"
							   +"4. Eliminar noticia."+"\n"
							   +"5. Mostrar todas las noticias por redactor/a"+"\n"
							   +"6. Calcular precio de la noticia."+"\n"
							   +"7. Calcular puntución de la noticia."+"\n"
							   +"0. Salir del programa.");
	}
	static byte newsMenu() {
		return Teclado.leerByte("1. Football."+"\n"
							   +"2. Basketball."+"\n"
							   +"3. Tenis."+"\n"
							   +"4. Formula 1."+"\n"
							   +"5. Motorcycling."+"\n"
							   +"0. Atrás.");
	}
	
	//DATA CONTROL
	
	static void addRedactor(Redactor redactor) {
		
		redactors.add(redactor);
	}
	
	static void removeRedactor(int redactorIndex) {
		
		redactors.remove(redactorIndex);
	}
	
	static int findRedactor(String dni) {
		
		int redactorIndex = -1;
		boolean flag = true;
		int counter = 0;
		
		while(flag && counter < redactors.size()) {
			if(redactors.get(counter).getDni().equals(dni)) {
				redactorIndex = counter;
				flag = false;
			}else {
				counter++;
			}
		}
		return redactorIndex;
	}
	
	static void addNewsSelection(int redactorsIndex, String headline) {
		
		switch(newsMenu()) {
			case 1:
				redactors.get(redactorsIndex).addNews(new FootballNews(headline, Teclado.leerString("Introduzca la competición:"),
																					Teclado.leerString("Introduzca el club:"),
																						Teclado.leerString("Introduzca el jugador:")));
				break;
			case 2:
				redactors.get(redactorsIndex).addNews(new BasketballNews(headline, Teclado.leerString("Introduzca la competición:"),
																					Teclado.leerString("Introduzca el club:")));
				break;
			case 3:
				redactors.get(redactorsIndex).addNews(new TenisNews(headline, Teclado.leerString("Introduzca la competición:"),
																				Teclado.leerString("Introduzca el jugador:")));
				break;
			case 4:
				redactors.get(redactorsIndex).addNews(new Formula1News(headline, Teclado.leerString("Introduzca la escudería:")));
				break;
			case 5:
				redactors.get(redactorsIndex).addNews(new MotorcyclingNews(headline, Teclado.leerString("Introduzca el equipo:")));
				break;
			default:
				System.out.println("Error. Introduzca una opción válida.");
				System.out.println("");
				break;
		}
	}
	
	static boolean dniExists(String dni) {
		
		boolean dniExists = false;
		for(Redactor redactor: redactors) {
			if(redactor.getDni().equals(dni)) {
				dniExists = true;
			}
		}
		return dniExists;
	}
}
