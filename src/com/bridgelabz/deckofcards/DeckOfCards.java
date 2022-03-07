package com.bridgelabz.deckofcards;

/*
 * @purpose :Deck of cards
 * @file : DeckOfCards.java
 * @author : Shubham Singh
 */

import java.util.ArrayList;

public class DeckOfCards {

	public static ArrayList<String> deckCards = new ArrayList<String>();

	/*
	 * Method for getting Unique Deck of Cards
	 */
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

		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deckCards.add(suits[i] + " of " + ranks[j]);
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

	public static void toDisplay(ArrayList<String> deckCards) {
		System.out.println("\nCards in Deck:");
		for (String element : deckCards) {
			System.out.println(element);
		}

	}

}
