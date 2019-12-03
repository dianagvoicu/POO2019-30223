
public class Zi {
	String nume;
	Boolean lucratoare;

	public Zi(String nume, Boolean lucratoare) {
		this.nume = nume;
		this.lucratoare = lucratoare;
	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Boolean getIfLucratoare() {
		return this.lucratoare;
	}

	public void setIfLucratoare(Boolean lucratoare) {
		this.lucratoare = lucratoare;
	}
	
	public void mijlocSaptamana(Zi z) {
		if(z.getNume() == "Miercuri") {
			System.out.println("Este mijlocul saptamanii.");
		}
		else {
			System.out.println("Nu este mijlocul saptamanii.");
		}
	}
}
