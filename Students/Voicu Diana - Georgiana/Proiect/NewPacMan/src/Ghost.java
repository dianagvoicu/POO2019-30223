import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;
/**
 * 
 * @author Diana
 * Partea de MODEL, clasa ce implementeaza “fantomele”, care sunt de fapt inamicii lui pacman. 
 * Aceasta contine matricea pentru map/maze pentru orientarea lor.
 *
 **/
public class Ghost {
	
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
	
	private Image ghostRight;
	private Image ghostLeft;
	private Image ghostUp;
	private Image ghostDown;
	private int tileX;
	private int tileY;
	private int dir = -1;
	private int right =0, left=1, up=2, down=3;
	ImageIcon img;
	Image finalImg;
	public Random randomGen;
	int x,y;
	
	public int getDir() {
		return this.dir;
	}
	
	/**
	 * un constructor cu imaginiile necesare fantomei: right, left, up, down, coordonatele x,y , 
	 * precum si pozitiile din matrice ale acestor coordinate (tiles), directiile de mutare sunt 
	 * codificate cu 0,1,2,3, getters si setters pentru toate acestea.
	 * @param r coordonata x
	 * @param q coordonata y
	 **/
	public Ghost(int r, int q) {
		randomGen = new Random();
		img = new ImageIcon("icons/ghost1Right.gif");
		ghostRight = img.getImage();
		img = new ImageIcon("icons/ghost1Left.gif");
		ghostLeft = img.getImage();
		img = new ImageIcon("icons/ghost1Up.gif");
		ghostUp = img.getImage();
		img = new ImageIcon("icons/ghost1Down.gif");
		ghostDown = img.getImage();
		dir = randomGen.nextInt(4);
		tileX = r/25;
		tileY = q/25;
		x= r;
		y= q;

	}
	
	public Image getGhost() {
		return finalImg;
	}
	
	public void setGRight(Image ghst) {
		this.ghostRight = ghst;
	}
	public void setGLeft(Image ghst) {
		this.ghostLeft = ghst;
	}
	public void setGUp(Image ghst) {
		this.ghostUp = ghst;
	}
	public void setGDown(Image ghst) {
		this.ghostDown = ghst;
	}
	public void setGhost(Image ghst) {
		this.finalImg = ghst;
	}
	
	public int getTileX() {
		return this.tileX;
	}
	public int getTileY() {
		return this.tileY;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {;
		return this.y;
	}
	
	/**
	 * randomChanging(), metoda care ia directia generata random si o verifica cu fiecare dintre 
	 * codificarile noastre. Daca directia generata random corespunde unei directii codificate, 
	 * se verifica daca fantoma se poate muta, apeland canMove(), iar daca aceasta returneaza true, 
	 * fantoma se va misca , pozitia din matrice modificandu-se, iar daca nu, se va genera o alta directie 
	 * random, pana se ajunge la o miscare valida.
	 **/
	public void randomChanging() {
			if( dir == left) {
				if(canMove(tileX-1,tileY)) {
					setGhost(ghostLeft);
					tileX-=1;
				}
				else {
					dir = randomGen.nextInt(4);	}
				
			} else if(dir == right) {
				if(canMove(tileX+1,tileY)) {
					setGhost(ghostRight);
					tileX+=1;
				}
				else {
					dir = randomGen.nextInt(4);	}
				
			}else if(dir == up) {
				if(canMove(tileX,tileY-1)) {
					setGhost(ghostUp);
					tileY-=1;
				}
				else {
					dir = randomGen.nextInt(4);	}
				
			}else if(dir == down) {
				if(canMove(tileX,tileY+1)) {
					setGhost(ghostDown);
					tileY+=1;
				}
				else {
					dir = randomGen.nextInt(4);	}
				
			} 
	}
	
	/**
	 * metoda canMove() , aceasta verifica daca pozitia pe care dorim sa mutam ghost-ul nu este perete, 
	 * iar atunci aceasta va returna true, altfel va returna false.
	 * @param nextTileX X-ul urmatoarei patratele din maze
	 * @param nextTileY Y-ul urmatoarei patratele din maze
	 * @return returneaza daca valoarea este adevarata sau falsa
	 **/
	
	public boolean canMove(int nextTileX, int nextTileY) {
		if(dataMap[nextTileX][nextTileY] != -1) {
			return true;
		}
		else {
			return false;
		}
	}
}
