package javasmmr.zoowsome.models.animals;

import java.util.Random;

public abstract class Animal implements Killer {
	protected Integer nrOfLegs;
	protected String name;
	final Double maintenanceCost;
	final double dangerPerc;
	Boolean takenCareOf= false;
	
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
	
	public Boolean getIfTakenCareOf() {
		return this.takenCareOf;
	}
	public void setIfTakenCareOf(Boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}
	
	public Animal(Integer nrOfLegs,String name,Double maintenanceCost,double dangerPerc) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}
	
	@Override
	public boolean kill() {
		Random r = new Random();
		double randomValue = 0 + (1 - 0) * r.nextDouble();
		if(randomValue < this.dangerPerc) {
			return true;
		}
		return false;
		
	}

	public Double getMaintenanceCost() {
		return this.maintenanceCost;
	}
}
