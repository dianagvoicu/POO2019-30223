package Pachet;

public class Produs {
	protected String nume;
	public int pret;
	protected int nrExemplare;
	
	public Produs(String nume, int pret, int nrExemplare) {
		this.nume = nume;
		this.pret = pret;
		this.nrExemplare = nrExemplare;
	}
	
	public int getPret() {
		return pret;
	}
	
	boolean esteInStoc () {
		if(nrExemplare > 0) {
			return true;
		}
		return false;
	}
}
