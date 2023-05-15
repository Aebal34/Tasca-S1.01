package n3exercici1;

public class BasketballNews extends News{

	//ATRIBUTES
	private String competition;
	private String club;
	
	//CONSTRUCTOR
	
	public BasketballNews(String headline, String competition, String club) {
		
		super(headline);
		this.competition = competition;
		this.club = club;
	}
	
	//GETTERS
	
	public String getCompetition() {
		return competition;
	}
	public String getClub() {
		return club;
	}
	
	//METHODS
	
	public int calculatePriceNews() {
		
		int price = 300;
		
		if(competition.equals("Euroliga")) {
			price += 75;
		}
		if(club.equals("Barça")||club.equals("Madrid")) {
			price += 100;
		}
		return price;
	}
	public int calculateScoreNews() {
		
		int score = 4;
		
		if(competition.equals("Euroliga")) {
			score += 3;
		}else if(competition.equals("ACB")) {
			score += 2;
		}
		if(club.equals("Barça")||club.equals("Madrid")) {
			score += 1;
		}
		return score;
	}
	
	//DATA CONTROL
	
	@Override
	public String toString() {
		return "Noticia de basketball."+"\n"+
				"Competición=" + competition +"\n"+
				"Club=" + club +"\n"+
				"Titular="+ headline +"\n"+
				"Texto=" + text;
	}
}
