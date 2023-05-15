package n3exercici1;

public class TenisNews extends News{

	private String competition;
	private String player;
	
	//CONSTRUCTOR
	
	public TenisNews(String headline, String competition, String player) {
		
		super(headline);
		this.competition = competition;
		this.player = player;
	}
	
	//GETTERS
	
	public String getCompetition() {
		return competition;
	}
	public String getPlayer() {
		return player;
	}
	
	//METHODS
	
	public int calculatePriceNews() {
		
		int price = 150;
		
		if(player.equals("Federer")||player.equals("Nadal")||player.equals("Djokovic")) {
			price += 100;
		}
		return price;
	}
	public int calculateScoreNews() {
		
		int score = 4;
		
		if(player.equals("Federer")||player.equals("Nadal")||player.equals("Djokovic")) {
			score += 3;
		}
		return score;
	}
	
	//DATA CONTROL
	
	@Override
	public String toString() {
		return "Noticia de tenis."+"\n"+
				"Competición=" + competition +"\n"+
				"Titular="+ headline +"\n"+
				"Texto=" + text;
	}
}
