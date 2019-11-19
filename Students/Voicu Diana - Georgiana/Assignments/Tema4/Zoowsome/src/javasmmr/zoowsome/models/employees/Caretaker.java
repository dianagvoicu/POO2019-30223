package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I{
	
	protected Double workingHours;

	public Caretaker(String name, BigDecimal salary, Double workingHours) {
		super(name, salary);
		this.workingHours = workingHours;
	}
	
	public Double getWorkingHours() {
		return this.workingHours;
	}
	
	public void setWorkingHours(Double workingHours) {
		this.workingHours= workingHours;
	}

	@Override
	public String takeCareOf(Animal a) {
		if(a.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if(this.workingHours < a.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		a.setIfTakenCareOf(true);
		this.workingHours = this.workingHours - a.getMaintenanceCost();
		return Constants.Employees.Caretakers.TCO_SUCCES;
	}

}
