
public class FunctiiMultiple{
	
	public FunctiiMultiple() {
		
	}
	
	public void g ( ) throws Exceptie2{
		
	}
	
	public void f ( ) throws Exceptie1{
		try {
			g();
		}
		catch(Exceptie2 e) {
			e.printStackTrace();
			Exceptie1 exc = new Exceptie1("Mesaj");
			throw exc;
		}
	}
	
	public static void main (String[] args) throws Exceptie2 {
		FunctiiMultiple t = new FunctiiMultiple();
		try {
			t.f();
			t.g();
		}
		catch (Exceptie1 e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Am ajuns si aici.");
		}
	}
}
