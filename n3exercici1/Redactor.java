package n3exercici1;
import java.util.ArrayList;
public class Redactor {

	//ATRIBUTES
	
	private String name;
	private final String dni;
	private static int salary = 1500;
	
	private ArrayList<News> newsList;
	
	//CONSTRUCTOR
	
	public Redactor(String name, String dni) {
		
		this.name = name;
		this.dni = dni;
		newsList = new ArrayList<News>();
	}
	
	//GETTERS
	
	public String getName() {
		return name;
	}
	public String getDni() {
		return dni;
	}
	public int getSalary() {
		return salary;
	}
	public ArrayList<News> getNews(){
		return newsList;
	}
	
	//SETTERS
	
	public void setName(String name) {
		this.name = name;
	}
	
	static void incrementSalary(int increment) {
		salary += increment;
	}
	
	//METHODS
	
	public void addNews(News news) {
		newsList.add(news);
	}
	
	public void removeNews(String headline) {
		
		int newsIndex = findNews(headline);
		
		if(newsIndex >= 0) {
			newsList.remove(newsIndex);
		}else {
			System.out.println("No se ha encontrado la noticia.");
			System.out.println("");
		}
		
	}
	
	public int findNews(String headline) {
		
		int newsIndex = -1;
		boolean flag = true;
		int counter = 0;
		
		while(flag && counter < newsList.size()) {
			if(newsList.get(counter).getHeadline().equals(headline)){
				newsIndex = counter;
				flag = false;
			}else {
				counter++;
			}
		}
		return newsIndex;
	}
	
	
	public void showNews() {
		
		System.out.println("Noticias de "+name+":");
		for(int i=0; i<newsList.size(); i++) {
			System.out.println(newsList.get(i));
			System.out.println("");
		}
	}
}
