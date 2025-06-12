package warGame;
import java.util.ArrayList;
//import startWar.StartGame;
import java.util.List;
import java.util.Collections;


public class Deck {
	private List<Cards> cards;
	String[] suits = {"S", "D", "C", "H"};
	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
	private Cards[] deck = new Cards[52];
	private int topCard;
	
	public Deck() {
		this.cards = new ArrayList<>();
		//createDeck();
		//shuffleDeck();
		//dealCards();
	}
	
	/*private void createDeck() 
	{
		
		int count = 0;
		for(int i = 0; i < suits.length; i++) {
			for(int j = 0; j < ranks.length; j++) {
				deck[count] = new Cards(suits[i], ranks[j], values[j]);
				count++;
			}
		}
		shuffleDeck();
	}*/
	
	/*public void shuffleDeck() 
	{
		topCard = 0;
		for(int i = 0; i < deck.length; i++) {
			int j = (int)(Math.random()*52);
			int k = (int)(Math.random()*52);
			Cards tmpCard = deck[j];
			deck[j] = deck[k];
			deck[k] = tmpCard;
			
		}
	}*/
	
	//Deal the cards from the deck to players
	/*public void dealCards() {
		//Cards theCard;
		int i = 0;
		for(int k = 0; k < 26; k+= 2) {
			p1Deck[i].add(values[k]);
			sDeck[i].add(values[k+1]);
			i++;
		}
	}*/

}
