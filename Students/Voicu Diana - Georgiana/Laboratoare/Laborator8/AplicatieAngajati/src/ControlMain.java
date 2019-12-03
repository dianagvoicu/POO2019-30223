
public class ControlMain {
	public static void main (String[] args) {
		try {
			Exception e = new Exception("Exceptie");
			throw e;
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		finally {
			System.out.println("The final stage has been recieved.");
		}
	}
}
