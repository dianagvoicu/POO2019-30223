package Pachet;

public class Control {
	public static void main (String[] args) throws Exception{
		Supermarket s = new Supermarket();
		Angajat a = new Angajat(1,"Maria", "21 Noiembrie", 5);
		Angajat a2 = new Angajat(2,"Mariana", "2 Noiembrie", 2);
		Angajat a3 = new Angajat(3,"Alin", "1 Noiembrie", 4);
		Client c = new Client(1,"Diana",2);
		Produs p = new Produs("Perie de par",20,5);
		Produs p2 = new Produs("Deodorant",20,5);
		ClientFidel c1 = new ClientFidel(1,"Alina",5);
		s.addAngajat(a);
		s.addAngajat(a2); 
		s.addAngajat(a3);
		s.addProdus(p);
		s.addClient(c);
		a.printInformatii();
		boolean x =p.esteInStoc();
		System.out.println("Produsul este in stoc? "+x);
		c.printInformatii();
		int x2= c1.calculeazaPuncte(750);
		System.out.println(x2);
		int x3= c1.calculeazaDiscount(x2);
		System.out.println(x3);
		s.printAngajati();
		
	} 
}
