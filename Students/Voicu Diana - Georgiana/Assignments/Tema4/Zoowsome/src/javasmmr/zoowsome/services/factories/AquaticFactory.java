package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Clownfish;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Whale;

public class AquaticFactory extends SpeciesFactory{
	public Animal getAnimal(String type) throws Exception{
		if(Constants.Animals.Aquatics.Shark.equals(type)) {
			return new Shark();
		} else if(Constants.Animals.Aquatics.Whale.equals(type)) {
			return new Whale();
		} else if(Constants.Animals.Aquatics.Clownfish.equals(type)) {
			return new Clownfish();
		} else {
			throw new Exception ("Invalid animal exception!");
		}
	}

}
