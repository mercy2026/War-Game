package warGame;

public class Cards {
	private String suit;
	private String rank;
	private int value;
	/*private int cardNum;
	String[] suits = {"S", "D", "C", "H"};
	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	*/
	
	public Cards(String suit, String rank, int value) {
		this.suit = suit;
		this.rank = rank;
		this.value = value;
	}
	
	//Setter and Getter for Card Ranks
			public String getRank() {
				return rank;
			}
			public void setRank(String rank) {
				this.rank = rank;
			}
			
			//Setter and Getter for Suits
			public String getSuit() {
				return suit;
			}
			public void setSuit(String suit) {
				this.suit = suit;
			}
			
			

}
