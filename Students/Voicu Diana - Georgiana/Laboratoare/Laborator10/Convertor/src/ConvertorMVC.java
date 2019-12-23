
public class ConvertorMVC {
	public static void main(String[] args) {
		Model model = new Model();
		View view = new View(model);
		@SuppressWarnings("unused")
		Controller controller = new Controller(model, view);
		view.setVisible(true);
	}
}
