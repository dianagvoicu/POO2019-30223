import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * 
 * @author Diana
 * – partea de VIEW, dar si o oarecare parte de CONTROL a structurii MVC, de departe,
 *  cea mai complexa clasa, aceasta imbina majoritatea claselor create si controleaza sirul evenimentelor.
 *  Acesta contine o matrice de int-uri , prezenta si in clasa Ghost, care ne va ajuta la generarea mapei.
 *
 **/
@SuppressWarnings("serial")
public class Maze extends JPanel implements ActionListener{
	private Timer t;
	private Image wall;
	private Image black;
	private Image pellet;
	private Image powerpellet;
	private Image finish;
	public Player p;
	private Ghost ghosts[] = new Ghost[4];
	private int limitDown = 27;
	private int limitUp = 0;
	
	int fixed[][] = new int[31][28];
	
	int dataMap[][] =
		{
		         {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		         {-1,10,10,10,10,10,10,10,10,10,10,10,10,-1,-1,10,10,10,10,10,10,10,10,10,10,10,10,-1},
		         {-1,10,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,10,-1},
		         {-1,50,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,50,-1},
		         {-1,10,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,10,-1},
		         {-1,10,10,10,10,10, 5,10,10,10,10,10,10,10,10,10,10,10,10,10,10, 5,10,10,10,10,10,-1},
		         {-1,10,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,10,-1},
		         {-1,10,-1,-1,-1,-1,10,-1,-1,10,10,10,10,-1,-1,10,10,10,10,-1,-1,10,-1,-1,-1,-1,10,-1},
		         {-1,10,10,10,10,10,10,-1,-1,10,10,10,10,-1,-1,10,10,10,10,-1,-1,10,10,10,10,10,10,-1},
		         {-1,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {-1,-1, 0, 0, 0,-1,10,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {-1,-1, 0, 0, 0,-1,10,-1,-1,10,10,10,10,10,10,10,10,10,10,-1,-1,10, 0, 5,-1,-1,-1,-1},
		         {-1,-1, 0, 0, 0,-1,10,-1,-1,10,-1,-1,-1, 0, 0,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1, 0, 0, 0, 0, 0, 0,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {10,10,10,10,10,10,10,10,10,10, 0, 0, 0, 7, 0, 0, 0, 0,10,10,10,10,10,10,10,10,10,10},
		         {-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1, 0, 0, 0, 0, 0, 0,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {-1,-1, 0, 0, 0,-1,10,-1,-1,10,-1,-1,-1, 0, 0,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {-1,-1, 0, 0, 0,-1,10,-1,-1,10,10,10,10,10,10,10,10,10,10,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {-1,-1, 0, 0, 0,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1},
		         {-1,10,10,10,10,10,10,10,10,10,10,10,10,-1,-1,10,10,10,10,10,10,10,10,10,10,10,10,-1},
		         {-1,10,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,10,-1},
		         {-1,10,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,10,-1},
		         {-1,50,10,10,-1,-1,10,10,10,10,10,10,10,-1,-1,10,10,10,10,10,10,10,-1,-1,10,10,50,-1},
		         {-1,10,-1,10,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1, 5,-1,-1,10,-1,-1,-1},
		         {-1,10,-1,10,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,10,-1,-1,-1},
		         {-1,10,10,10, 5,10,10,-1,-1,10,10,10,10,-1,-1,10,10,10,10,-1,-1,10,10,10,10,10,10,-1},
		         {-1,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,10,-1},
		         {-1,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,10,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,10,-1},
		         {-1,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,-1},
		         {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
		        };
	/**
	 * constructor unde se adauga KeyListener si se apleaza metoda initialize() 
	 **/
	
	public Maze() {
		addKeyListener(new MyAL());
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		initialize();
	}
	
	/**
	 * aceasta metoda intializeaza timer-ul, adauga toata imaginile necesare noua, 
	 * il creeaza pe pacman, impreuna cu fantomele si creeaza o copie a matricei de 
	 * care vom avea nevoie mai tarziu.
	 **/
	void initialize() {
		ImageIcon img = new ImageIcon("icons/pellet.png");
		pellet = img.getImage();
		img = new ImageIcon("icons/wall.png");
		wall = img.getImage();
		img = new ImageIcon("icons/black.png");
		black = img.getImage();
		img = new ImageIcon("icons/powerpellet.png");
		powerpellet = img.getImage();
		img = new ImageIcon("icons/treasure.jpg");
		finish = img.getImage();

		p = new Player();
		ghosts[0]= new Ghost(125,150);
		
		ghosts[1]= new Ghost(125,525);
		
		ghosts[1].setGhost(new ImageIcon("icons/ghost2Right.gif").getImage());
		ghosts[1].setGRight(new ImageIcon("icons/ghost2Right.gif").getImage());
		ghosts[1].setGLeft(new ImageIcon("icons/ghost2Left.gif").getImage());
		ghosts[1].setGUp(new ImageIcon("icons/ghost2Up.gif").getImage());
		ghosts[1].setGDown(new ImageIcon("icons/ghost2Down.gif").getImage());
		
		ghosts[2]= new Ghost(575,225);
		
		ghosts[2].setGhost(new ImageIcon("icons/ghost3Right.gif").getImage());
		ghosts[2].setGRight(new ImageIcon("icons/ghost3Right.gif").getImage());
		ghosts[2].setGLeft(new ImageIcon("icons/ghost3Left.gif").getImage());
		ghosts[2].setGUp(new ImageIcon("icons/ghost3Up.gif").getImage());
		ghosts[2].setGDown(new ImageIcon("icons/ghost3Down.gif").getImage());
		
		ghosts[3]= new Ghost(575,600);
		
		ghosts[3].setGhost(new ImageIcon("icons/ghost4Right.gif").getImage());
		ghosts[3].setGRight(new ImageIcon("icons/ghost4Right.gif").getImage());
		ghosts[3].setGLeft(new ImageIcon("icons/ghost4Left.gif").getImage());
		ghosts[3].setGUp(new ImageIcon("icons/ghost4Up.gif").getImage());
		ghosts[3].setGDown(new ImageIcon("icons/ghost4Down.gif").getImage());
		
		for (int i = 0; i < 31; i++) {
			for (int j = 0; j < 28; j++) {
				fixed[i][j] = dataMap[i][j];
			}
		}

		t = new Timer(100, this);
		t.start();
	}

	/**
	 * Metoda actionPerformed(), este extinde clasa ActionListener, 
	 * avand grija ca dupa fiecare actiune sa apeleze toate metodele necesare si sa redeseneze tot. 
	 **/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(isAlive == true) {
		eatFood();
		grabKey();
		highest();
		updateAll();
		randomMovement();
		pacmanLife();
		repaint();
		}
	}

	/**
	 * metoda paint() – care parcurge matricea si deseneaza intregul maze, 
	 * deseneaza fantomele, il deseneaza pe pacman, scorul si numarul de keys ramase.
	 *  Determina si apelarea metodei de endGame() in caz ca pacman moare, si metoda grabTreasure() 
	 *  in caz ca toate cheiile au fost colectionate.
	 **/
	public void paint(Graphics g) {
		super.paint(g);

		for (int i = 0; i < 31; i++) {
			for (int j = 0; j < 28; j++) {
				switch (dataMap[i][j]) {
				case -1:
					g.drawImage(wall, i * 25, j * 25, null);
					break;
				case 10:
					g.drawImage(pellet, i * 25, j * 25, null);
					break;
				case 50:
					g.drawImage(powerpellet, i * 25, j * 25, null);
					break;
				case 0:
					g.drawImage(black, i * 25, j * 25, null);
					break;
				case 7:
					g.drawImage(finish, i * 25, j * 25, null);
					break;
				case 5:
					g.drawImage(new ImageIcon("icons/key.jpg").getImage(), i*25, j*25, null);
					break;
				case 9:
					g.drawImage(new ImageIcon("icons/final.jpg").getImage(), i*25, j*25, null);
					break;
				case 3:
					g.drawImage(new ImageIcon("icons/orange.jpg").getImage(), i*25, j*25, null);
					break;
				}
			}
		}
		g.drawImage(p.getPlayer(), p.getTileX() * 25, p.getTileY() * 25, null);
		g.drawImage(ghosts[0].getGhost(), ghosts[0].getTileX() *25, ghosts[0].getTileY() * 25, null);
		g.drawImage(ghosts[1].getGhost(), ghosts[1].getTileX() *25, ghosts[1].getTileY() * 25, null);
		g.drawImage(ghosts[2].getGhost(), ghosts[2].getTileX() *25, ghosts[2].getTileY() * 25, null);
		g.drawImage(ghosts[3].getGhost(), ghosts[3].getTileX() *25, ghosts[3].getTileY() * 25, null);
		int fontSize = 20;
	    g.setFont(new Font("TimesRoman", Font.BOLD, fontSize));
	    g.setColor(Color.yellow);
	    g.drawString("SCORE: ",250 , 80);
		g.drawString(scoreLabel.getText(),275 ,110);
		
		g.setFont(new Font("TimesRoman", Font.BOLD, fontSize));
	    g.setColor(Color.yellow);
	    g.drawString(" KEYS: ",400 , 80);
		g.drawString(keyLabel.getText(),425 ,110);
		
		if(numberOfKeys == 0) {
			grabTreasure(g);
		}
		boolean alive = isAlive;
		if(alive == false) {
			endGame(g);
		}
	}
	
	/**
	 * 
	 * endGame() deseneaza un ecran negru in cazul in care jocul se termina, 
	 * cu un mesaj: game Over si posibilitatea de a apasa tasta Space pentru a reincepe jocul. 
	 * Matricea initiala va fi umpluta cu valorile din matricea fixed, pentru a se putea reseta jocul initial.
	 * @param g Parametrul graphics cu care desenam si apelam functiile de care avem nevoie.
	 **/
	public void endGame(Graphics g) {
		for (int i = 0; i < 31; i++) {
			for (int j = 0; j < 28; j++) {
				g.drawImage(black, i * 25, j * 25, null);
			}
		}
	    g.drawImage(new ImageIcon("icons/gameOver.png").getImage(),250 , 200,this);
	    
	    g.setFont(new Font("Ariel", Font.BOLD, 30));
	    g.setColor(Color.RED);
	    g.drawString("Press Space to Restart!",220 , 400);
	    
	    for (int i = 0; i < 31; i++) {
			for (int j = 0; j < 28; j++) {
				dataMap[i][j] = fixed[i][j];
			}
	    }
	}

	/**
	 * 
	 * @author Diana
	 * Clasa MyAL() declarata inauntru reprezinta o clasa speciala ce extinde KeyAdapter, 
	 * determinand metodele de override : keyPressed(), keyRealeased(), keyTyped().
	 *
	 **/
	public class MyAL extends KeyAdapter {

		/**
		 * metoda keyPressed(), determinant care dintre taste au fost apasate si dand functii fiecarora. 
		 * Astfel, daca se va apasa tasta right, se va deplasa spre dreapta, daca se apasa stanga spre 
		 * stanga, si asa mai departe, iar daca se apasa Space, se va reseta jocul. Aici am aplicat si 
		 * conditia ca daca pacman iese cumva din frame, acesta sa revina in joc pe partea opusa, prin tunel. 
		 * Aceasta clasa contine de asemenea setters si getters pentru variabile.
		 **/
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_SPACE) {
				isAlive = true;
				score = 0;
				numberOfKeys =5;
				initialize();
					
			}
			if (keyCode == KeyEvent.VK_UP) {
				p.up();
				if (p.getTileY() - 1 >= limitUp) {
					if (dataMap[p.getTileX()][p.getTileY() - 1] != -1) {
						p.move(0, -1);
					}
				} else {
					p.move(0, 27);
				}
			}

			if (keyCode == KeyEvent.VK_DOWN) {
				p.down();
				if (p.getTileY() + 1 <= limitDown) {
					if (dataMap[p.getTileX()][p.getTileY() + 1] != -1) {
						p.move(0, 1);
					}
				} else {
					p.move(0, -27);
				}
			}

			if (keyCode == KeyEvent.VK_RIGHT) {
				p.right();
				if (dataMap[p.getTileX() + 1][p.getTileY()] != -1) {
					p.move(1, 0);
				}
			}

			if (keyCode == KeyEvent.VK_LEFT) {
				p.left();
				if (dataMap[p.getTileX() - 1][p.getTileY()] != -1) {
					p.move(-1, 0);
				}
			}

		}

		public void keyReleased(KeyEvent e) {

		}

		public void keyTyped(KeyEvent e) {

		}
	}

	int score = 0;
	
	/**
	 * Metoda eatFood() verifica daca coordonatele matricei pe care se afla pacman, 
	 * coincide cu coordonatele pe care se afla mancarea, iar daca da, scorul se va modifica in 
	 * functie de tipul mancarii si bucata din matrice va fi inlocuita cu un drum normal.
	 **/
	public void eatFood() {
		if (dataMap[p.getTileX()][p.getTileY()] == 10) {
			dataMap[p.getTileX()][p.getTileY()] = 0;
			score = score + 5;
		} else if (dataMap[p.getTileX()][p.getTileY()] == 50) {
			dataMap[p.getTileX()][p.getTileY()] = 0;
			score = score + 10;
		}
	}
	
	int numberOfKeys = 5;
	
	/**
	 * Metoda grabKey() procedeaza la fel precum cea anterioara, 
	 * insa aici verificarea se va face cu coordonatele pe care se afla keys, 
	 * determinant modificarea numarului de keys daca pacman obtine cheia.
	 **/
	public void grabKey() {
		if (dataMap[p.getTileX()][p.getTileY()] == 5) {
			dataMap[p.getTileX()][p.getTileY()] = 0;
			numberOfKeys --;
		}
	}
	
	/**
	 * Metoda grabTreasure() procedeaza la fel precum cele anterioare, 
	 * insa intai este verificata conditia ca toate cheile sa fie obtinute de pacman, 
	 * numai atunci acesta va putea obtine si comoara si va determina castigarea jocului. 
	 * Astfel se determina un ecran de WIN, ce va contine o imagine, scorul curent, highest score, 
	 * precum si un buton pentru reinceperea jocului.
	 * @param g parametrul grafic cu prin care apelam functiile de desenat
	 **/
	public void grabTreasure(Graphics g) {
			if (dataMap[p.getTileX()][p.getTileY()] == 7) {
				dataMap[p.getTileX()][p.getTileY()] = 0;
				t.stop();
				for (int i = 0; i < 31; i++) {
					for (int j = 0; j < 28; j++) {
						g.drawImage(black, i * 25, j * 25, null);
					}
				}
			    g.drawImage(new ImageIcon("icons/Win.jpg").getImage(),0 , 0,this);
			    g.setFont(new Font("Ariel", Font.BOLD, 30));
			    g.setColor(Color.YELLOW);
			    g.drawString("Press Space to Restart!",220 , 650);
			    
			    g.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
			    g.setColor(Color.YELLOW);
			    g.drawString("Your Score: " + scoreLabel.getText(),220 , 100);
			    
			    g.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
			    g.setColor(Color.YELLOW);
			    g.drawString("Highest Score: " + highestLabel.getText(),220 , 150);
			    
			    for (int i = 0; i < 31; i++) {
					for (int j = 0; j < 28; j++) {
						dataMap[i][j] = fixed[i][j];
					}
			    }
		}
	}
	
	JLabel scoreLabel = new JLabel();
	JLabel keyLabel = new JLabel();
	JLabel highestLabel = new JLabel();
	int highScore = 0;
	
	/**
	 * Metoda highest() determina cel mai mare scor provenit din toate jocurile, 
	 * si il tine minte pe cel mai mare.
	 **/
	public void highest() {
		if(getScore() > highScore) {
			highScore = getScore();
		}
	}

	/**
	 * metoda updateAll(), actualizeaza scorul, highest score si numarul de keys dupa fiecare mutare.
	 **/
	public void updateAll(){
	    scoreLabel.setText(" "+getScore());
	    keyLabel.setText(" " +getNrOfKeys());
	    highestLabel.setText(" " +highScore);
	}
	
	public int getScore() {
		return this.score;
	}
	
	public int getHighScore() {
		return this.highScore;
	}
	
	public int getNrOfKeys() {
		return this.numberOfKeys;
	}
	
	public boolean getIfAlive() {
		return this.isAlive;
	}
	
	
	/**
	 * metoda randomMovement(), apeleaza metoda randomChanging() din clasa Ghost, 
	 * pentru fiecare fantoma in parte permanent.
	 **/
	public void randomMovement() {
		for(int i=0;i<ghosts.length;i++) {
			ghosts[i].randomChanging();
		}
	}
	
	boolean isAlive = true;
	/**
	 * metoda pacmanLife() verifica daca pozitiile x,y ale matricei la care se afla pacman, 
	 * coincid cu pozitiile x,y ale matricei la care se afla fantomele, iar daca acest criteriu
	 *  este indeplinit, inseamna ca pacman va fi omorat, altfel acesta traieste. Daca pacman moare,
	 *   tot jocul se va opri, astfel dand comanda t.stop().
	 **/
	public void pacmanLife() {
		for(int i=0;i<ghosts.length;i++) {
		if(p.getTileX() == ghosts[i].getTileX() && p.getTileY() == ghosts[i].getTileY()) {
			isAlive = false;
		}
	}
		if(isAlive == false) {
			t.stop();
		}
	}
}
