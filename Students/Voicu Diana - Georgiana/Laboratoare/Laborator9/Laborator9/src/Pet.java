public class Pet {

	String nume;
	String rasa;
	int varsta;

	public Pet(String nume, String rasa, int varsta) {
		this.nume = nume;
		this.rasa = rasa;
		this.varsta = varsta;
	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getRasa() {
		return this.rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

}
