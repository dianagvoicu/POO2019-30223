package javasmmr.zoowsome.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.Constants;

public class ListFrame extends ZooFrame {

	public ListFrame(String title) throws ParserConfigurationException, SAXException, IOException {
		super(title);
		
		contentPanel.setLayout(new GridLayout(0,2));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		panel1.setLayout(new GridLayout());
		panel2.setLayout(new GridLayout());
		
		contentPanel.add(panel1);
		contentPanel.add(panel2);
		
		
		DefaultTableModel animalTableModel = new DefaultTableModel();
		String[] headers = {"Type", "Name" , "Danger Percent", "Maintenance Cost", "Number of Legs"};
		
		JTable animalTable = new JTable();
		
		animalTable.setBackground(Color.PINK);
		animalTableModel.setColumnIdentifiers(headers);
		
		Object[] rowData = new Object[5];
		
		AnimalRepository myAnimalRepository = new AnimalRepository();
		ArrayList<Animal> myAnimals = myAnimalRepository.load();
		for(int i = 0; i < myAnimals.size(); i++) {
			rowData[0] = myAnimals.get(i).getClass().getName().substring(33);
			rowData[1] = myAnimals.get(i).getName();
			rowData[2] = myAnimals.get(i).getDancerPerc();
			rowData[3] = myAnimals.get(i).getMaintenanceCost();
			rowData[4] = myAnimals.get(i).getNrOfLegs();
			animalTableModel.addRow(rowData);
		}
		
		animalTable.setModel(animalTableModel);
		animalTable.setRowHeight(30);
		animalTable.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel1.add(new JScrollPane(animalTable));
		
		DefaultTableModel employeeTableModel = new DefaultTableModel();
		String[] employeeHeaders = {"Name" , "Salary", "Status",};
		
		JTable employeeTable = new JTable();
		
		employeeTableModel.setColumnIdentifiers(employeeHeaders);
		employeeTable.setBackground(Color.MAGENTA);
		
		rowData = new Object[5];
		
		EmployeeRepository myEmployeeRepository = new EmployeeRepository("Employees.xml",Constants.XML_TAGS.EMPLOYEE);
		ArrayList<Employee> myEmployees = myEmployeeRepository.load();
		for(int i = 0; i < myEmployees.size(); i++) {
			rowData[0] = myEmployees.get(i).getName();
			rowData[1] = myEmployees.get(i).getSalary();
			rowData[2] = myEmployees.get(i).getIfIsDead();
			employeeTableModel.addRow(rowData);
		}
		
		employeeTable.setModel(employeeTableModel);
		employeeTable.setRowHeight(30);
		employeeTable.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		panel2.add(new JScrollPane(employeeTable));
		
	}

}
