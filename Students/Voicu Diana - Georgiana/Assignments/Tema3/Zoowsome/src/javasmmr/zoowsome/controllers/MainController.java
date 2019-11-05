package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

public class MainController {
	public static void main (String[] args) throws Exception{
		AnimalFactory abstractFactory = new AnimalFactory();
		
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
		SpeciesFactory speciesFactory2 = abstractFactory.getSpeciesFactory(Constants.Species.Reptiles);
		SpeciesFactory speciesFactory3 = abstractFactory.getSpeciesFactory(Constants.Species.Birds);
		SpeciesFactory speciesFactory4 = abstractFactory.getSpeciesFactory(Constants.Species.Insects);
		SpeciesFactory speciesFactory5 = abstractFactory.getSpeciesFactory(Constants.Species.Aquatics);
		
		Animal a1= speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
		Animal a2= speciesFactory2.getAnimal(Constants.Animals.Reptiles.Chameleon);
		Animal a3= speciesFactory3.getAnimal(Constants.Animals.Birds.Mockingbird);
		Animal a4= speciesFactory4.getAnimal(Constants.Animals.Insects.Butterfly);
		Animal a5= speciesFactory5.getAnimal(Constants.Animals.Aquatics.Clownfish);
		
		//Mammal m1 = (Mammal)a1;
		Reptile r1 = (Reptile)a2;
		Bird b1 = (Bird)a3;
		Insect i1 = (Insect)a4;
		Aquatic aq1 = (Aquatic)a5;
		
		System.out.printf("We have an animal with %d legs and its name is %s!\n",a1.getNrOfLegs(), a1.getName());
		System.out.printf("We have an animal that lays eggs: %s and its name is %s!\n",r1.getLaysEggs(), r1.getName());
		System.out.printf("We have an animal which migrates: %s and the height of its flight is %d meters!\n",b1.ifMigrates(), b1.getAvaFlightAltitude());
		System.out.printf("We have an animal that is dangerous: %s and flies: %s!\n",i1.ifIsDangerous(), i1.ifCanFly());
		System.out.printf("We have an animal with %d Swim Depth and its Water Type is %s!\n",aq1.getAvgSwimDepth(), aq1.getWaterType());
	}
}
