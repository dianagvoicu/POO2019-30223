
@SuppressWarnings("serial")
public class Exceptie extends Exception {
	
	public Exceptie (String exceptie) {
		super(exceptie);
	}
	
	public void afiseaza(Exceptie e) {
		e.printStackTrace();
	}
	
	public static void main (String[] args) {
		Exceptie e = new Exceptie("Mesaj");
		try {
			e.afiseaza(e);
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
	}
}
