package Pachet;

public class Persoana {
	protected int ID;
	protected String nume;
	
	public Persoana(int ID, String nume) {
		this.ID = ID;
		this.nume = nume;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getNume() {
		return nume;
	}
	
	void printInformatii () {
		System.out.println("ID-ul este " + getID() + " Numele este " + getNume());
	}
}
