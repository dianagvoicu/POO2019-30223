import java.awt.Color;

public class ControlStudent {
	public static void main(String[] args) throws CloneNotSupportedException {
		Masina m = new Masina("Ford Fiesta",Color.BLACK,false);
		Student s = new Student("Aniston","Jennifer",m);
		
		Masina m2 = (Masina)m.clone();
		System.out.println("Masina m2 dupa clonare: "+ m2.getMarca()+ " " + m2.getCuloare() + " " + m2.getIfRevopsita());
		m.modificaCuloare(Color.RED);
		System.out.println("Culoarea masinii dupa vopsire este: "+m.getCuloare());
		Student s2 = s.shallowClone();
		System.out.println("Student s2 dupa shallow clonare: "+ s2.getNume()+ " " + s2.getPrenume() + " " + ((Masina)s2.getMasina()).getCuloare());
		Student s3 = s.deepClone();
		System.out.println("Student s3 dupa deep clonare: "+ s3.getNume()+ " " + s3.getPrenume() + " " + ((Masina)s3.getMasina()).getCuloare());
	}
}
