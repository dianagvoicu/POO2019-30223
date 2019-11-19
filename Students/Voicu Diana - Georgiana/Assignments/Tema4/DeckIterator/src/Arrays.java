
public class Arrays {
	public static void sort2(Comparable<Card>[] elements) {
		Integer elementsLength = elements.length;
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i < elementsLength - 1; i++) {
				for (int j = i + 1; j < elementsLength; j++) {
					Comparable<Card> leftElement = elements[i];
					Comparable<Card> rightElement = elements[j];
					if (leftElement != null && rightElement != null && leftElement.compareTo((Card) rightElement) > 0) {
						sorted = false;
						elements[i] = rightElement;
						elements[j] = leftElement;
					}
				}
			}
		}
	}
}
