package com.bridgelabz.deckofcards;

/*
 * @purpose :Deck of cards
 * @file : DeckOfCards.java
 * @author : Shubham Singh
 */

import java.util.ArrayList;

public class DeckOfCards {

	public static ArrayList<String> deckCards = new ArrayList<String>();

	public void deckOfCard() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace" };
		int numOfDeckCards = suits.length * ranks.length;
		System.out.println("\nNumber of cards in the deck:" + numOfDeckCards);
		/*
		 * @purpose : Ability to arrange the Deck of cards in sequence
		 * 
		 * @return : No return Value;
		 */

		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deckCards.add(ranks[i] + " -> " + suits[j]);
			}
		}
		/*
		 * getting cards according to their rank and suits
		 */
		toDisplay(deckCards);
	}

	/*
	 * displaying cards
	 */

	public static void toDisplay(ArrayList<String> cardsDeck) {
		System.out.println("\nCards in Deck:");
		for (String element : cardsDeck) {
			System.out.println(element);
		}
		System.out.println();
	}

}
