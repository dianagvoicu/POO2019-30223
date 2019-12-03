
public class Lucrator {
	String nume;
	CalendarLucru c;

	public Lucrator(String nume) {
		this.nume = nume;
		this.c = new CalendarLucru();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public CalendarLucru getCalendar() {
		return c;
	}

	public void setCalendar(CalendarLucru calendar) {
		this.c = calendar;
	}

	public void lucreaza(String zi) throws ExceptieZiNelucratoare {
		boolean verificare = false;
		int ct = 0;
		for (int i = 0; i < c.zile.length; i++) {
			if (c.zile[i].getNume() == zi) {
				ct++;
				if (c.zile[i].getIfLucratoare() == true) {
					System.out.println(c.zile[i].getNume() + " este o zi lucratoare pentru lucrator.");
					verificare = true;
				}
			}
		}
		if (ct == 0) {
			System.out.println("Ziua data este invalida.");
			verificare = true;
		}
		if (verificare == false) {
			throw new ExceptieZiNelucratoare();
		}
	}
}
