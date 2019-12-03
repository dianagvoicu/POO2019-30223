
public class Student implements Cloneable {
	String nume;
	String prenume;
	Masina masina;

	public Student(String nume, String prenume, Masina masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}

	public Student() {

	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public Masina getMasina() {
		return this.masina;
	}

	public void setMasina(Masina masina) {
		this.masina = masina;
	}

	protected Student deepClone() throws CloneNotSupportedException {
		Student s = (Student) super.clone();
		s.setMasina((Masina) s.getMasina().clone());
		return s;
	}

	protected Student shallowClone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}
}
