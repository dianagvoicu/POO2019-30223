import java.util.Iterator;

public class CardDeck implements Iterator<String> {

	private String[] card;
	private int cardIndex;
	private int i = 0;
	private int nrOfCards;

	public CardDeck(int nrOfCards) {
		this.cardIndex = 0;
		this.nrOfCards = nrOfCards;
		this.card = new String[this.nrOfCards];
	}

	public void addCard(String c) {
		card[cardIndex] = c;
		cardIndex++;
	}

	@Override
	public boolean hasNext() {
		if (card[i] != "A") {
			return true;
		}
		return false;
	}

	@Override
	public String next() {
		return card[i++];
	}

	public void removeCard(String c) {
		for (int i = 0; i < nrOfCards; i++) {
			if (card[i] == c) {
				for (int j = i + 1; j < nrOfCards; j++) {
					if (card[j - 1] != null) {
						card[j - 1] = card[j];
					}
				}
				nrOfCards--;
			}
		}
	}

	public void printDeck() {
		for (int j = 0; j < this.nrOfCards; j++) {
			System.out.print(card[j] + " ");
		}
	}

}
