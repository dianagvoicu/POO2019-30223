package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;

import javasmmr.zoowsome.models.employees.Caretaker;

public class CaretakerFactory extends EmployeeFactory {
	public Caretaker getNewCaretaker(String type) {
		if (Constants.EmployeeTypes.Caretaker.equals(type)) {
			return new Caretaker("Dati nume", BigDecimal.valueOf(0), (double) 0);
		} else {
			return null;
		}
	}
}
