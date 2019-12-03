import java.util.Arrays;
public class Control {
	public static void print(Persoana[] p) {
		int i=0;
		while(i<p.length && p[i] != null) {
			System.out.print(p[i].getNume() + " " + p[i].getVarsta() + " ");
			i++;
		}
	}
	public static void main(String[] args) {
		Persoana[] p = new Persoana[5];
		p[0] = new Persoana("Smith","John",35);
		p[1] = new Persoana("Arch","Katherine",21);
		p[2] = new Persoana("Franklin","Benjamin",20);
		p[3] = new Persoana("Adams","Brian",57);
		p[4] = new Persoana("Johnson","Luna",21);
		System.out.println("Persoanele inainte de sortare sunt: ");
		print(p);
		Arrays.sort(p);
		System.out.println();
		System.out.println("Persoanele dupa sortare sunt: ");
		print(p);
	}
}
