
public class MainClass {
	public static void main(String[] args) {
		//6.1
		Lucrator l = new Lucrator("Gigel");
		try {
			l.lucreaza("Luni");
			l.lucreaza("Marte");
			l.lucreaza("Duminica");
		} catch (ExceptieZiNelucratoare e) {
			e.printStackTrace();
		}
		//6.2
		Lucrator l2 = null;
		try {
			l2.lucreaza("Luni");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//6.3
		Zi zile[] = new Zi[5];
		zile[0] = new Zi("Luni",true);
		try {
			zile[5].mijlocSaptamana(zile[5]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
