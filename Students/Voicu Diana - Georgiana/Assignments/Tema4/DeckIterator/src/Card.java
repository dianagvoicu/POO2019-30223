public class Card implements Comparable<Card> {
	private String suit;
	private String number;

	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}

	public String getSuit() {
		return this.suit;
	}

	public void setSuit(String newSuit) {
		this.suit = newSuit;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String newNumber) {
		this.number = newNumber;
	}

	public int convertNumberToInt(String nr) {
		if (nr == "2") {
			return 2;
		}
		if (nr == "3") {
			return 3;
		}
		if (nr == "4") {
			return 4;
		}
		if (nr == "5") {
			return 5;
		}
		if (nr == "6") {
			return 6;
		}
		if (nr == "7") {
			return 7;
		}
		if (nr == "8") {
			return 8;
		}
		if (nr == "9") {
			return 9;
		}
		if (nr == "10") {
			return 10;
		}
		if (nr == "J") {
			return 11;
		}
		if (nr == "Q") {
			return 12;
		}
		if (nr == "K") {
			return 13;
		}
		if (nr == "A") {
			return 14;
		}
		return 0;
	}

	public int convertSuitToInt(String s) {
		if (s == "Clubs") {
			return 1;
		} else if (s == "Diamonds") {
			return 2;
		} else if (s == "Hearts") {
			return 3;
		} else {
			return 4;
		}
	}

	@Override
	public int compareTo(Card card) {
		if (convertNumberToInt(this.number) == convertNumberToInt(card.getNumber())
				&& convertSuitToInt(this.suit) == convertSuitToInt(card.getSuit())) {
			return 0;
		} else if (convertNumberToInt(this.number) == convertNumberToInt(card.getNumber())) {
			if (convertSuitToInt(this.suit) < convertSuitToInt(card.getSuit())) {
				return -1;
			} else {
				return 1;
			}
		} else if (convertSuitToInt(this.suit) == convertSuitToInt(card.getSuit())) {
			if (convertNumberToInt(this.number) < convertNumberToInt(card.getNumber())) {
				return -1;
			} else {
				return 1;
			}
		} else if (convertSuitToInt(this.suit) < convertSuitToInt(card.getSuit())) {
			return -1;
		} else if (convertSuitToInt(this.suit) > convertSuitToInt(card.getSuit())) {
			return 1;
		}
		return 0;

	}

}
