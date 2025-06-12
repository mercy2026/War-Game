package warGame;

import java.util.ArrayList;
import java.util.List;

public class Systems {
	private String name;
	private List<Cards> hand;
	
	public Systems(){
		name = "System";
		this.hand = new ArrayList<>();
	}
	

	
	public List<Cards> getHand(){
		return hand;
	}
	
	public void drawCard(Cards card) {
		hand.add(card);
	}
	
	//Both the system
	public int playHand(int index) {
		if(index < 0 || index >= hand.size()) {
			return null;
		}
		return hand.remove(0);
	}
	
	public int getHandSize() {
		return hand.size();
	}

}
