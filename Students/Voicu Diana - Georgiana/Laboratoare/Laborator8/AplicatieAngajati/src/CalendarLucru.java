
public class CalendarLucru {
	Zi[] zile = { new Zi("Luni", true), new Zi("Marti", true), new Zi("Miercuri", true), new Zi("Joi", true),
			new Zi("Vineri", true), new Zi("Sambata", false), new Zi("Duminica", false) };

	public CalendarLucru() {

	}

	public Zi getZi(int i) {
		return this.zile[i];
	}

	public void setZi(int i, Zi z) {
		this.zile[i] = z;
	}

}