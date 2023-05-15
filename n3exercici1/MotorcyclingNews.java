package n3exercici1;

public class MotorcyclingNews extends News{

private String team;
	
	//CONSTRUCTOR
	
	public MotorcyclingNews(String headline, String team) {
		
		super(headline);
		this.team = team;
	}
	
	//GETTERS
	
	public String getTeam() {
		return team;
	}
	
	//METHODS
	
	public int calculatePriceNews() {
		
		int price = 100;
		
		if(team.equals("Honda")||team.equals("Yamaha")) {
			price += 50;
		}
		return price;
	}
	public int calculateScoreNews() {
		
		int score = 3;
		
		if(team.equals("Honda")||team.equals("Yamaha")) {
			score += 3;
		}
		return score;
	}
	
	//DATA CONTROL
	
	@Override
	public String toString() {
		return "Noticia de motociclismo."+"\n"+
				"Equipo=" + team +"\n"+
				"Titular="+ headline +"\n"+
				"Texto=" + text;
	}
}
