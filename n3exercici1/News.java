package n3exercici1;

public abstract class News {
	
	//ATRIBUTES
	
	protected  String headline;
	protected String text;
	protected int score;
	protected int price;
	
	//CONSTRUCTOR
	
	protected News(String headline) {
		this.headline = headline;
		text = "";
		score = 0;
		price = 0;
	}

	//GETTERS
	
	protected String getHeadline() {
		return headline;
	}
	
	//METHODS
	
	protected abstract int calculatePriceNews();
	
	protected abstract int calculateScoreNews();
	
}
