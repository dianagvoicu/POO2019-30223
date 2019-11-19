package javasmmr.zoowsome.services.factories;

public class EmployeeFactory {

	public EmployeeFactory getEmployeeFactory(String type) {
		if (Constants.EmployeeTypes.Caretaker.equals(type)) {
			return new CaretakerFactory();
		} else {
			return null;
		}
	}

}
