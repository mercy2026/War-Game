package startWar;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import warGame.Cards;
//import warGame.Cards;
//import warGame.Player;
import warGame.Deck;
//import warGame.Systems;

public class StartGame {
	
	private static List<Integer> p1Deck;
	private static  List<Integer> sDeck;
	static String[] suits = {"S", "D", "C", "H"};
	static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	static int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		
	private static Cards[] deck = new Cards[52];
	private static int topCard;
	
	public static void main(String[] args) {
		System.out.println("Welcome to War!");
		System.out.println("LET THE WAR GAME BEGIN!");
		System.out.println();
		StartGame();
		dealCards();
		
		determineWinner();
	}
	
	public static void StartGame() {
		createDeck();
		//Deck deck = new Deck();
		//Player p1 = new Player("Mercy");
		p1Deck = new ArrayList<>();
		sDeck = new ArrayList<>();
		
	}
	
	private static void createDeck() 
	{
		
		int count = 0;
		for(int i = 0; i < suits.length; i++) {
			for(int j = 0; j < ranks.length; j++) {
				deck[count] = new Cards(suits[i], ranks[j], values[j]);
				count++;
			}
		}
		shuffleDeck();
	}
	
	public static void shuffleDeck() 
	{
		topCard = 0;
		for(int i = 0; i < deck.length; i++) {
			int j = (int)(Math.random()*52);
			int k = (int)(Math.random()*52);
			Cards tmpCard = deck[j];
			deck[j] = deck[k];
			deck[k] = tmpCard;
			
		}
	}
	
	public static void dealCards() {
		//Cards theCard;
		int i = 0;
		for(int k = 0; k < 26; k+= 2) {
			p1Deck.add(i, values[k]);
			sDeck.add(i, values[k+1]);
			i++;
		}
	}
	
	public static void playRound() {
		int p1Card = p1Deck.remove(0);
		int sCard = sDeck.remove(0);
		
		System.out.println("Player 1 plays: " + p1Card);
		System.out.println("System plays: " + sCard);
		
		if(p1Card > sCard) {
			p1Deck.add(p1Card);
			p1Deck.add(sCard);
		}
		else if(p1Card < sCard) {
			sDeck.add(sCard);
			sDeck.add(p1Card);
		}
		else
		{
			System.out.println("Tie");
			p1Deck.add(p1Card);
			sDeck.add(sCard);
		}
		
	}
	
	
	public static void determineWinner() {
		while(p1Deck.size() > 0 && sDeck.size() > 0) {
			playRound();
		}
		if(p1Deck.size() == 0) {
			System.out.println("Player 1 Loses!");
		}
		else
		{
			System.out.println("System Loses!");
		}
	}

}
