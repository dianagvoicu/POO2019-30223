package Pachet;

public class ClientFidel extends Client {
	protected int nrPuncteAcumulate=0;
	protected int discount=0;
	protected int suma;
	
	public ClientFidel(int ID, String nume, int nrProduseCumparate) {
		super(ID, nume, nrProduseCumparate);
	}
	
	public int getNrPuncteAcumulate() {
		return nrPuncteAcumulate;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	int calculeazaPuncte (int suma) {
		if(suma >50 && suma < 100) {
			nrPuncteAcumulate++;
		}
		else if(suma > 100 && suma < 500) {
			nrPuncteAcumulate += 3;
		}
		else if(suma > 500) {
			nrPuncteAcumulate += 5;
		}
		return nrPuncteAcumulate;
	}
	
	int calculeazaDiscount (int nrPuncteAcumulate) {
		if(nrPuncteAcumulate == 1) {
			discount = 5;
		}
		else if(nrPuncteAcumulate == 3) {
			discount = 10;
		}
		else if(nrPuncteAcumulate == 5) {
			discount = 20;
		}
		return discount;
	}
	
	@Override
	void printInformatii () {
		System.out.println("ID-ul este " + getID() + " Numele este " + getNume() + " Nr de produse cumparate " + getNrProduseCumparate());
		int i=0;
		while(produse[i]!= null) {
			System.out.print(produse[i]);
		}
		System.out.println("Numarul de puncte acumulate este= " + getNrPuncteAcumulate() + " Discountul este = " + getDiscount());
	}
	
	
}
