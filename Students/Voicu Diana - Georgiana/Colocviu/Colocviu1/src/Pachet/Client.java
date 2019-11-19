package Pachet;

public class Client extends Persoana {
	protected int nrProduseCumparate;
	public Produs[] produse = new Produs[nrProduseCumparate];
	private int produsIndex=0;
	
	public Client(int ID, String nume,int nrProduseCumparate) {
		super(ID, nume);
		this.nrProduseCumparate = nrProduseCumparate;
		}
	
	public void addInLista(Produs p) {
		produse[produsIndex] = p;
		produsIndex++;
	}
	
	public int getNrProduseCumparate() {
		return nrProduseCumparate;
	}
	
	@Override
	void printInformatii () {
		System.out.println("ID-ul este" + getID() + "Numele este " + getNume() + "Nr de produse cumparate " + getNrProduseCumparate());
		//int i=0;
		/*while(produse[i]!= null) {
			System.out.println(produse[i]);
			i++;
		}*/
	}
	
}
