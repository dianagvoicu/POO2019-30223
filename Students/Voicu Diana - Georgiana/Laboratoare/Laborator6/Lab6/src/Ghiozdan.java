
public class Ghiozdan {
	
	private Rechizita[] rechizita;
	private int index;
	
	public Ghiozdan(int sizeOfRechizita) {
		this.rechizita = new Rechizita[sizeOfRechizita];
		this.index=0;
	}
	
	public void addCaiet(Caiet caiet) {
		if(index != rechizita.length) {
		rechizita[index]=caiet;
		index++;
		}
		else {
			System.err.println("Lista este plina.");
		}
	}
	
	public void addManual(Manual manual) {
		if(index != rechizita.length) {
			rechizita[index]=manual;
			index++;
			}
			else {
				System.err.println("Lista este plina.");
			}
	}
	
	public void listItems() {
		int i=0;
		while(rechizita[i] != null) {
			System.out.print(rechizita[i].getNume() + " ");
			i++;
		}
	}
	
	public void listManual() {
		for(int i=0;i<rechizita.length;i++) {
			if(rechizita[i] instanceof Manual) {
				System.out.print(rechizita[i].getNume()+" ");
			}
		}
	}
	
	public void listCaiet() {
		for(int i=0;i<rechizita.length;i++) {
			if(rechizita[i] instanceof Caiet) {
				System.out.print(rechizita[i].getNume()+" ");
			}
		}
	}
	
	public int getNrRechizite() {
		int ct=0;
		int i=0;
		while(rechizita[i]!= null) {
			ct++;
			i++;
		}
		return ct;
	}
	
	public int getNrManuale() {
		int ct=0;
		for(int i=0;i<rechizita.length; i++) {
			if(rechizita[i] instanceof Manual) {
				ct++;
			}
		}
		return ct;
	}
	
	public int getNrCaiete() {
		int ct=0;
		for(int i=0;i<rechizita.length; i++) {
			if(rechizita[i] instanceof Caiet) {
				ct++;
			}
		}
		return ct;
	}
}
