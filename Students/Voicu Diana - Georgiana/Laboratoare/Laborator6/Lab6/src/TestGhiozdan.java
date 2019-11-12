
public class TestGhiozdan {
	public static void main(String[] args) {
		Ghiozdan g= new Ghiozdan(30);
		Caiet c1 = new Caiet("Dictando");
		Caiet c2 = new Caiet("Patratele");
		Caiet c3 = new Caiet("Studentesc");
		Manual m1 = new Manual("Romana");
		Manual m2 = new Manual("Matematica");
		Manual m3 = new Manual("Biologie");
		g.addCaiet(c1);
		g.addManual(m1);
		g.addCaiet(c2);
		g.addCaiet(c3);
		g.addManual(m2);
		g.addManual(m3);
		int ct =g.getNrRechizite();
		System.out.println("Nr de rechizite este" + "= " + ct);
		ct= g.getNrCaiete();
		System.out.println("Nr de caiete este" + "= " + ct);
		ct=g.getNrManuale();
		System.out.println("Nr de manuale este" + "= " + ct);
		g.listItems();
		System.out.println();
		g.listCaiet();
		System.out.println();
		g.listManual();
		
	}
}
