package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class MainMenuFrame extends ZooFrame {
	private JButton btnAdd;
	private JButton btnList;
	private JButton btnSaveAndExit;
	
	public MainMenuFrame(String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		contentPanel.add(panel);
		
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnAdd = new JButton("Add");
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, btnAdd, 0, SpringLayout.HORIZONTAL_CENTER, pan);
		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, btnAdd, -100, SpringLayout.VERTICAL_CENTER, pan);
		pan.add(btnAdd);
		
		btnList = new JButton("List");
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, btnList,0, SpringLayout.HORIZONTAL_CENTER, pan);
		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, btnList, 0, SpringLayout.VERTICAL_CENTER, pan);
		pan.add(btnList);
		
		btnSaveAndExit = new JButton("Save And Exit");
		slPanel.putConstraint(SpringLayout.HORIZONTAL_CENTER, btnSaveAndExit,0, SpringLayout.HORIZONTAL_CENTER, pan);
		slPanel.putConstraint(SpringLayout.VERTICAL_CENTER, btnSaveAndExit,100, SpringLayout.VERTICAL_CENTER, pan);
		pan.add(btnSaveAndExit);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	
		public void setAddButtonActionListener(ActionListener a) {
			btnAdd.addActionListener(a);
		}
		
		public void setListButtonActionListener(ActionListener a) {
			btnList.addActionListener(a);
		}
		
		public void setSaveAndExitButtonActionListener(ActionListener a) {
			btnSaveAndExit.addActionListener(a);
		}
	
}
