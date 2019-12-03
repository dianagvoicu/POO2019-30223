import java.awt.Color;

public class Masina implements Cloneable {
	String marca;
	Color culoare;
	Boolean revopsita;

	public Masina(String marca, Color culoare, Boolean revopsita) {
		this.marca = marca;
		this.culoare = culoare;
		this.revopsita = revopsita;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Color getCuloare() {
		return this.culoare;
	}

	public void setCuloare(Color culoare) {
		this.culoare = culoare;
	}

	public Boolean getIfRevopsita() {
		return this.revopsita;
	}

	public void setIfRevopsita(Boolean revopsita) {
		this.revopsita = revopsita;
	}

	public Masina clone() throws CloneNotSupportedException {
		return (Masina) super.clone();
	}
	
	public void modificaCuloare(Color newCuloare) {
		if(this.getIfRevopsita() == false) {
			this.setCuloare(newCuloare);
		}
		else {
			System.out.println("Masina a fost deja revopsita.");
		}
	}
}
