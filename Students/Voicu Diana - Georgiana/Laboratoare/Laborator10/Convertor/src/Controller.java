import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	private Model convModel;
	private View convView;

Controller(Model model, View view) {
		convModel = model;
		convView = view;
		view.addExchangeListener(new ExchangeListener());
		view.addClearListener(new ClearListener());
}

class ExchangeListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
	String sel1= (String) View.inputBox.getSelectedItem();
	String sel2= (String) View.outputBox.getSelectedItem();
	try {
	if( sel1 == sel2){
		String input = convView.getUserInput();
		convModel.setValue(Double.parseDouble(input));
		convView.setTotal(convModel.getValue());
	}
	else if( sel1 == "RON" &&  sel2 == "EUR"){
		String input = convView.getUserInput();
		Double output =Double.parseDouble(input)/4.7;
		convModel.setValue(output);
		convView.setTotal(convModel.getValue());
	}
	else if( sel1 == "EUR" &&  sel2 == "RON"){
		String input = convView.getUserInput();
		Double output =Double.parseDouble(input)*4.7;
		convModel.setValue(output);
		convView.setTotal(convModel.getValue());
	}	
	else if( sel1 == "RON" &&  sel2 == "USD"){
		String input = convView.getUserInput();
		Double output =Double.parseDouble(input)/4.3;
		convModel.setValue(output);
		convView.setTotal(convModel.getValue());
	}
	else if( sel1 == "USD" &&  sel2 == "RON"){
		String input = convView.getUserInput();
		Double output =Double.parseDouble(input)*4.3;
		convModel.setValue(output);
		convView.setTotal(convModel.getValue());
	}	
	else if( sel1 == "USD" &&  sel2 == "EUR"){
		String input = convView.getUserInput();
		Double output =Double.parseDouble(input)*0.9;
		convModel.setValue(output);
		convView.setTotal(convModel.getValue());
	}
	else{
		String input = convView.getUserInput();
		Double output =Double.parseDouble(input)*1.1;
		convModel.setValue(output);
		convView.setTotal(convModel.getValue());
	}
	}
	 catch (NumberFormatException nfex) {
			convView.showError("Input-ul nu e bun!");
		}
	}
	}

class ClearListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
			convModel.reset();
			convView.reset();
		}
	}
}
