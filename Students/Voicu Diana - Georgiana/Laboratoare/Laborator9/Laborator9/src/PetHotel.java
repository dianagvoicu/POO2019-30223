import java.util.ArrayList;

public class PetHotel {
	ArrayList<Pet> petList = new ArrayList<Pet>();

	public PetHotel() {

	}

	void addPet(Pet a) {
		petList.add(a);
	}

	void removePet(Pet a) {
		petList.remove(a);
	}

	void printPets() {
		for (Pet x : petList) {
			System.out.println(x.getNume() + " " + x.getRasa() + " " + x.getVarsta());
		}
	}

}
