package javasmmr.zoowsome.controllers;

import java.math.BigDecimal;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.EmployeeAbstractFactory;
import javasmmr.zoowsome.services.factories.EmployeeFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;


public class MainController {
	
	public static Animal[] a = new Animal[5];
	public static Caretaker[] c = new Caretaker[5];
	public static int animalIndex =0;
	public static int caretakerIndex=0;
	
	public static void addAnimal(Animal animal) {
		a[animalIndex]=animal;
		animalIndex++;
	}
	
	public static void addCaretaker(Caretaker caretaker) {
		c[caretakerIndex]=caretaker;
		caretakerIndex++;
	}
	
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
		
		
		Caretaker c1 = new Caretaker("Roses",BigDecimal.valueOf(2000),(double) 5);
		Caretaker c2 = new Caretaker("Mel",BigDecimal.valueOf(2500),(double) 8);
		Caretaker c3 = new Caretaker("Brian",BigDecimal.valueOf(4000),(double) 10);
		Caretaker c4 = new Caretaker("Eleni",BigDecimal.valueOf(1800),(double) 2);
		Caretaker c5 = new Caretaker("Shay",BigDecimal.valueOf(1300),(double) 3);
		
		addAnimal(a1);
		addAnimal(a2);
		addAnimal(a3);
		addAnimal(a4);
		addAnimal(a5);
		
		addCaretaker(c1);
		addCaretaker(c2);
		addCaretaker(c3);
		addCaretaker(c4);
		addCaretaker(c5);
		
		String result;
		
		for(int i=0;i<caretakerIndex;i++) {
			for(int j=0;j<animalIndex;j++) {
				if(c[i].getIfIsDead() == false && a[j].getIfTakenCareOf() == false ) {
					result = c[i].takeCareOf(a[j]);
					if(result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						c[i].setIfIsDead(true);
					}
					else if(result.equals(Constants.Employees.Caretakers.TCO_SUCCES)) {
						a[j].setIfTakenCareOf(true);
					}
				}
			}
		}
	
	System.out.println();
	System.out.println("Are the animals taken care of?");
	for(int i=0;i<animalIndex;i++) {
		System.out.print(a[i].getName() + " " + a[i].getIfTakenCareOf());
		System.out.println();
	}
	
	System.out.println();
	System.out.println("Are they dead?");
	for(int i=0;i<caretakerIndex;i++) {
		System.out.print(c[i].getName() + " " + c[i].getIfIsDead());
		System.out.println();
	}
	
	AnimalRepository animalRep = new AnimalRepository();
	ArrayList<Animal> saveAnimals = new ArrayList<Animal>();

	saveAnimals.add(a[0]);
	saveAnimals.add(a[1]);
	saveAnimals.add(a[2]);
	saveAnimals.add(a[3]);
	saveAnimals.add(a[4]);
	
	animalRep.save(saveAnimals);

	System.out.println();
	ArrayList<Animal> loadAnimals = new ArrayList<Animal>();
	loadAnimals = animalRep.load();
	
	EmployeeRepository employeeRep = new EmployeeRepository();
	ArrayList<Employee> saveEmployee = new ArrayList<Employee>();
	
	saveEmployee.add(c[0]);
	saveEmployee.add(c[1]);
	saveEmployee.add(c[2]);
	saveEmployee.add(c[3]);
	saveEmployee.add(c[4]);
	
	employeeRep.save(saveEmployee);
	System.out.println();
	ArrayList<Employee> loadEmployee = new ArrayList<Employee>();
	loadEmployee = employeeRep.load();
	}
}
