import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MyTimer extends JPanel implements ActionListener {
	private Timer t;

	MyTimer() {
		t = new Timer(100, this);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
	}

}