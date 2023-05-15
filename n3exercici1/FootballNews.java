package n3exercici1;

public class FootballNews extends News{

	//ATRIBUTES
	
	private String competition;
	private String club;
	private String player;
	
	//CONSTRUCTOR
	
	public FootballNews(String headline, String competition, String club, String player) {
		
		super(headline);
		this.competition = competition;
		this.club = club;
		this.player = player;
	}
	
	//GETTERS
	
	public String getCompetition() {
		return competition;
	}
	public String getClub() {
		return club;
	}
	public String getPlayer() {
		return player;
	}
	
	//METHODS
	
	public int calculatePriceNews() {
		
		int price = 300;
		
		if(competition.equals("Champions League")) {
			price += 100;
		}
		if(club.equals("Barça")||club.equals("Madrid")) {
			price += 100;
		}
		if(player.equals("Ferran Torres")||player.equals("Benzema")) {
			price += 50;
		}
		return price;
	}
	public int calculateScoreNews() {
		
		int score = 5;
		
		if(competition.equals("Champions League")) {
			score += 3;
		}else if(competition.equals("League")) {
			score += 2;
		}
		if(club.equals("Barça")||club.equals("Madrid")) {
			score += 1;
		}
		if(player.equals("Ferran Torres")||player.equals("Benzema")) {
			score += 1;
		}
		return score;
	}

	//DATA CONTROL
	
	@Override
	public String toString() {
		return "Noticia de football."+"\n"+
				"Competición=" + competition +"\n"+
				"Club=" + club +"\n"+
				"Jugador estrella=" + player +"\n"+
				"Titular="+ headline +"\n"+
				"Texto=" + text;
	}

}
