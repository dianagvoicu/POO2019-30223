package Pachet;

public class Supermarket {
	Angajat[] angajati = new Angajat[30];
	ClientFidel[] fideli = new ClientFidel[10];
	Client[] clienti = new Client[20];
	Produs[] produse = new Produs[30];
	private int produsIndex = 0;
	private int angajatIndex = 0;
	private int clientIndex = 0;
	
	public void addProdus(Produs p) {
		produse[produsIndex] = p;
		produsIndex++;
	}
	
	public void addAngajat(Angajat a) {
		angajati[angajatIndex] = a;
		angajatIndex++;
	}
	
	public void addClient(Client c) {
		clienti[clientIndex] = c;
		clientIndex++;
	}
	
	
	public Supermarket() {
		
	}
	
	void printClientiFideli () {
		for(int i=0; i<10; i++) {
			if(fideli[i+1].suma > fideli[i].suma )
			{
				ClientFidel aux= fideli[i];
				fideli[i] = fideli[i+1];
				fideli[i+1] = aux;
			}
		}
		int i=0;
		while(fideli[i]!= null) {
			System.out.println(fideli[i]);
			i++;
		}
	}
	
	void printAngajati () {
		/*for(int i=0;i<30;i++) {
			if(angajati[i].getNrClientiServiti() < angajati[i+1].getNrClientiServiti()) {
				Angajat aux= angajati[i];
				angajati[i] = angajati[i+1];
				angajati[i+1] = aux;
				
			}
		} */
		
		int i=0;
		while(angajati[i]!= null) {
			System.out.println(angajati[i].getNume());
			i++;
		}
		
	}
	
	void showStatistici() {
		int nrProduseFideli=0;
		int nrProduseClienti=0;
		for(int i=0;i<fideli.length;i++) {
			nrProduseFideli += fideli[i].getNrProduseCumparate();
		}
		for(int i=0;i<clienti.length;i++) {
			nrProduseClienti += clienti[i].getNrProduseCumparate();
		}
		System.out.println("Nr de produse vandute clientilor fideli sunt= " + nrProduseFideli);
		System.out.println("Nr de produse vandute celorlalti clienti sunt= " + nrProduseClienti);
	}
	
	
}
