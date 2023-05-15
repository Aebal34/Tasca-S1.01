package n3exercici1;

public class Formula1News extends News{

private String team;
	
	//CONSTRUCTOR
	
	public Formula1News(String headline, String team) {
		
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
		
		if(team.equals("Ferrari")||team.equals("Mercedes")) {
			price += 50;
		}
		return price;
	}
	public int calculateScoreNews() {
		
		int score = 4;
		
		if(team.equals("Ferrari")||team.equals("Mercedes")) {
			score += 2;
		}
		return score;
	}
	
	//DATA CONTROL
	
	@Override
	public String toString() {
		return "Noticia de formula 1."+"\n"+
				"Escudería=" + team +"\n"+
				"Titular="+ headline +"\n"+
				"Texto=" + text;
	}
}
