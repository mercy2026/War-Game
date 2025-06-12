package warGame;
import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private List<Cards> hand;
	
	
	public Player(String name){
		this.name = name;
		this.hand = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public List<Cards> getHand(){
		return hand;
	}
	
	public void drawCard(Cards card) {
		hand.add(card);
	}
	
	//Both the system
	public Cards playHand(int index) {
		if(index < 0 || index >= hand.size()) {
			return null;
		}
		return hand.remove(0);
	}
	
	public int getHandSize() {
		return hand.size();
	}
	

}
