public class Persoana implements Comparable<Persoana> {
	
	String nume;
	String prenume;
	int varsta;
	
	public Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return this.nume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getVarsta() {
		return this.varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public int compareTo(Persoana p) {
		if(this.getVarsta() == p.getVarsta()) {
			return 0;
		}
		else if (this.getVarsta() > p.getVarsta()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
