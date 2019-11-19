
public class Deck implements OrderedIterator {

	private Card[] cards;
	private int cardIndex;
	private int i = 0;
	private int nrOfCards;

	public Deck(int nrOfCards) {
		this.cardIndex = 0;
		this.nrOfCards = nrOfCards;
		this.cards = new Card[this.nrOfCards];
	}

	public void addCard(Card c) {
		cards[cardIndex] = c;
		cardIndex++;
	}

	@Override
	public boolean hasNext() {
		if (cards[i].getNumber() != "A") {
			return true;
		}
		return false;
	}

	@Override
	public Card next() {
		return cards[++i];
	}

	public void removeCard(Card c) {
		for (int i = 0; i < nrOfCards; i++) {
			if (cards[i] == c) {
				for (int j = i + 1; j < nrOfCards; j++) {
					if (cards[j - 1] != null) {
						cards[j - 1] = cards[j];
					}
				}
				nrOfCards--;
			}
		}
	}

	public void printDeck() {
		int j = 0;
		while (j < cardIndex) {
			System.out.print(cards[j].getNumber() + " " + cards[j].getSuit() + " ");
			j++;
		}
		System.out.println();
	}

	@Override
	public int put(Comparable<Card> comparable) {
		int ct = 0;
		for (int m = 0; m < cards.length; m++) {
			if (comparable != null && cards[m] != null) {
				if (cards[m].getNumber() == ((Card) comparable).getNumber()
						&& cards[m].getSuit() == ((Card) comparable).getSuit()) {
					ct++;
				}
			}
		}
		if (ct == 0 && cardIndex != cards.length) {
			addCard((Card) comparable);
			Arrays.sort2(cards);
			return 1;
		} else {
			return 0;
		}
	}

}
