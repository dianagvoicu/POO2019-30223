
public class TestPet {
	public static void main(String[] args) {

		Pet p = new Pet("Zeus", "Bishon", 5);
		Pet p2 = new Pet("Royal", "Golden Retriever", 1);
		Pet p3 = new Pet("Ginger", "Pekingese", 5);
		Pet p4 = new Pet("Jennifer", "Dobermann", 7);
		Pet p5 = new Pet("Fae", "Rottweiler", 3);

		PetHotel hotel = new PetHotel();

		hotel.addPet(p);
		hotel.addPet(p2);
		hotel.addPet(p3);
		hotel.addPet(p4);
		hotel.addPet(p5);

		System.out.println("Lista animalelor:");
		hotel.printPets();

		hotel.removePet(p);
		hotel.removePet(p4);
		System.out.println("Lista animalelor dupa remove:");
		hotel.printPets();

	}
}
