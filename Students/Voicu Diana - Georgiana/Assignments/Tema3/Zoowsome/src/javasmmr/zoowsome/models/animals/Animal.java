package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	Integer nrOfLegs;
	String name;
	
	public Integer getNrOfLegs(){
		return this.nrOfLegs;
	}
	
	public void setNrOfLegs(int nrLegs){
		this.nrOfLegs= nrLegs; 
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Animal(Integer nrOfLegs,String name) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
	}
}
