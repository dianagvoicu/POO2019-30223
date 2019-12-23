import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View extends JFrame {
	private JTextField input = new JTextField(20);
	private JTextField output = new JTextField(20);
	public static String[] values = { "RON", "EUR", "USD"};
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static JComboBox inputBox = new JComboBox(values);
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static JComboBox outputBox = new JComboBox(values);
	ImageIcon exchangeable = new ImageIcon("icons/exchange.png");
	Image image = exchangeable.getImage();
	Image newImage = image.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
	private JButton exchange = new JButton(new ImageIcon(newImage));
	private JButton clear = new JButton("Clear");
	private Model convertorModel = new Model();

	public View(Model model) {
		convertorModel = model;
		convertorModel.setValue(Model.INITIAL_VALUE);
		output.setText(convertorModel.getValue());
		output.setEditable(false);
		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());
		content.add(new JLabel("Input"));
		content.add(input);
		content.add(inputBox);
		content.add(exchange);
		content.add(new JLabel("Total"));
		content.add(output);
		content.add(outputBox);
		content.add(clear);

		this.setContentPane(content);
		this.pack();

		this.setTitle("Convertor Bancar");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void reset() {
		output.setText((Model.INITIAL_VALUE).toString());
	}

	String getUserInput() {
		return input.getText();
	}

	void setTotal(String newTotal) {
		output.setText(newTotal);
	}

	void showError(String errMessage) {
		JOptionPane.showMessageDialog(this, errMessage);
	}

	void addExchangeListener(ActionListener eal) {
		exchange.addActionListener(eal);
	}

	void addClearListener(ActionListener cal) {
		clear.addActionListener(cal);
	}
}
