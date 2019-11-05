package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Flamingo;
import javasmmr.zoowsome.models.animals.Mockingbird;
import javasmmr.zoowsome.models.animals.Parrot;

public class BirdFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Birds.Parrot.equals(type)) {
			return new Parrot();
		} else if(Constants.Animals.Birds.Flamingo.equals(type)) {
			return new Flamingo();
		} else if(Constants.Animals.Birds.Mockingbird.equals(type)) {
			return new Mockingbird();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}

}
