package javasmmr.zoowsome.services.factories;

public abstract class EmployeeAbstractFactory {
	public abstract EmployeeFactory getEmployeeFactory(String type) throws Exception;
}
