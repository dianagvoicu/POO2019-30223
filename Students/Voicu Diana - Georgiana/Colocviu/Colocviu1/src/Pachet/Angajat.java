package Pachet;

public class Angajat extends Persoana {
	protected String data;
	protected int nrClientiServiti;
	
	public Angajat(int ID, String nume,String data, int nrClientiServiti) {
		super(ID, nume);
		this.data = data;
		this.nrClientiServiti = nrClientiServiti;
	}
	
	public String getData() {
		return data;
	}
	
	public int getNrClientiServiti() {
		return nrClientiServiti;
	}
	
	
	int servesteClient (Client a) {
		int suma = 0;
		for(int i=0; i< a.getNrProduseCumparate(); i++) {
			suma= suma + a.produse[i].getPret();
		}
		
		return suma;
	}
	
	@Override
	void printInformatii () {
		System.out.println("ID-ul este " + getID() + " Numele este " + getNume() + " Data angajarii " + getData() + " Numarul de clienti Serviti " + getNrClientiServiti() );
	}
	
}
