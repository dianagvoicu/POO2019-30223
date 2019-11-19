
public class TestDeck {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck(13);
		deck.addCard("2");
		deck.addCard("3");
		deck.addCard("4");
		deck.addCard("5");
		deck.addCard("6");
		deck.addCard("7");
		deck.addCard("8");
		deck.addCard("9");
		deck.addCard("10");
		deck.addCard("J");
		deck.addCard("Q");
		deck.addCard("K");
		deck.addCard("A");

		deck.printDeck();
		System.out.println();

		System.out.println("Verificam hasNext si Next: ");
		while (deck.hasNext()) {
			String ch = deck.next();
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println("Dam remove la J, pt. a verifica remove:");
		deck.removeCard("J");

		deck.printDeck();
		System.out.println();

		System.out.println("Dam remove la 7, pt. a verifica remove:");
		deck.removeCard("7");

		deck.printDeck();

		Card[] cards = new Card[10];
		Deck d = new Deck(10);
		Card c1 = new Card("Spades", "A");
		Card c2 = new Card("Spades", "Q");
		Card c3 = new Card("Spades", "5");
		Card c4 = new Card("Diamonds", "A");
		Card c5 = new Card("Spades", "2");
		Card c6 = new Card("Diamonds", "2");
		Card c7 = new Card("Clubs", "10");
		Card c8 = new Card("Hearts", "5");
		Card c9 = new Card("Spades", "K");
		Card c10 = new Card("Spades", "5");

		cards[0] = c1;
		cards[1] = c2;
		cards[3] = c3;
		cards[4] = c4;
		cards[5] = c5;
		cards[6] = c6;
		cards[7] = c7;
		cards[8] = c8;
		cards[9] = c9;

		System.out.println();
		System.out.println("Deck-ul inainte de sortare, dupa adaugare normala de CARDS in DECK:");
		d.addCard(c1);
		d.addCard(c2);
		d.printDeck();

		d.put(c3);
		d.put(c4);
		d.put(c5);
		d.put(c6);
		d.put(c7);
		d.put(c8);
		d.put(c9);

		System.out.println("Deck-ul dupa sortare, dupa adaugare si sortare de DECK:");
		d.printDeck();

		System.out.println("Incercam sa adaugam o carte ce deja exista: 5 Spades");
		d.put(c10);

		System.out.println("Dupa cum se poate observa, nu exista duplicate.");
		d.printDeck();

	}
}
