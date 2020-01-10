import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * 
 * @author Diana
 * Partea de CONTROL a structurii MVC, clasa de baza pentru creearea “Frame” 
 * si pentru realizarea paginii de titlu, contine metoda main si ne ofera rularea intregului program.
 *
 **/
public class GameController implements ActionListener {
	JFrame titleFrame;
	JFrame f = new JFrame();
	JFrame n = new JFrame();
	Maze m = new Maze();

	public static void main(String[] args) {
		new GameController();

	}

	/**
	 * Contine un constructor care implementeaza “frame”-ul pentru titlu, 
	 *  prezinta un buton, a carei apasare determina deschiderea “frame”-ului pentru joc.
	 **/
	public GameController() {
		titleFrame = new JFrame();
		ImageIcon title = new ImageIcon("icons/title.png");
		JLabel managetitle = new JLabel(title);
		titleFrame.setSize(700, 700);
		titleFrame.setLocationRelativeTo(null);
		titleFrame.setVisible(true);
		titleFrame.getContentPane().setBackground(Color.black);
		titleFrame.add(managetitle);

		ImageIcon starting = new ImageIcon("icons/start-title.png");
		Image i = starting.getImage();
		i = i.getScaledInstance(90, 51, java.awt.Image.SCALE_SMOOTH);
		starting = new ImageIcon(i);
		JButton start = new JButton(starting);
		start.setBackground(Color.black);
		start.setBounds(300, 480, 90, 51);
		start.addActionListener(this);
		titleFrame.add(start);
	}

	/**
	 * Metoda care determina creeare de ecran
	 **/
	public void createGameScreen() {
		titleFrame.setVisible(false);
		f.add(m);
		f.setTitle("PACMAN");
		f.setSize(795, 750);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.getContentPane().setBackground(Color.black);
		f.setTitle("PACMAN");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		createGameScreen();
	}
}
