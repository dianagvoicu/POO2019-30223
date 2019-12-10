import java.util.ArrayList;

public class FacebookAccount {
	protected String nume;
	protected int varsta;
	protected String locatieCurenta;
	protected ArrayList<FacebookAccount> friends = new ArrayList<FacebookAccount>();

	public FacebookAccount(String nume, int varsta, String locatieCurenta) {
		this.nume = nume;
		this.varsta = varsta;
		this.locatieCurenta = locatieCurenta;
	}

	public String getNume() {
		return this.nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getLocatieCurenta() {
		return this.locatieCurenta;
	}

	public void setLocatieCurenta(String locatieCurenta) {
		this.locatieCurenta = locatieCurenta;
	}

	public void addFriend(FacebookAccount x) {
		for (FacebookAccount y : friends) {
			if (y.getNume().equals(x.getNume()) && y.getVarsta() == x.getVarsta()
					&& y.getLocatieCurenta().equals(x.getLocatieCurenta())) {
				System.out.println("Prietenul exista deja.");
				return;
			}
		}
		friends.add(x);
	}

	public void removeFriend(FacebookAccount x) {
		friends.remove(x);
	}

	public void listFriends() {
		for (FacebookAccount j : friends) {
			System.out.println(j.getNume() + " " + j.getVarsta() + " " + j.getLocatieCurenta());
		}
	}

	public void findFriends(String location) {
		for (FacebookAccount j : friends) {
			if (j.getLocatieCurenta().equals(location)) {
				System.out.println((j.getNume() + " " + j.getVarsta()));
			}
		}
	}	
}
