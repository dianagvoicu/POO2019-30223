public class Model {
	
	public static final Double INITIAL_VALUE = (double) 0;
	private Double total;

	public Model() {
		reset();
	}

	public void reset() {
		this.total = INITIAL_VALUE;
	}

	public void setValue(Double value) {
		this.total = value;
	}

	public String getValue() {
		return String.format("%.7f", total).toString();
	}

	public void showError(String string) {
		// TODO Auto-generated method stub
		
	}

}
