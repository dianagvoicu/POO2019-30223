import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * 
 * @author Diana
 * Partea de MODEL, clasa ce il implementeaza pe “pacman”. 
 *
 **/
public class Player {
	public int tileX, tileY;

	// private Image pacmanImage;
	private Image pacmanUp;
	private Image pacmanDown;
	private Image pacmanLeft;
	private Image pacmanRight;
	Image finalImg;
	ImageIcon img;

	/**
	 * un constructor cu toate imaginile necesare mutarii lui: right, left, up, down  
	 * cat si pozitiile din matrice x si y (tiles), getters si setters pentru acestea
	 **/
	public Player() {
		img = new ImageIcon("icons/pacmanRight.jpg");
		pacmanRight = img.getImage();
		img = new ImageIcon("icons/pacmanLeft.jpg");
		pacmanLeft = img.getImage();
		img = new ImageIcon("icons/pacmanUp.jpg");
		pacmanUp = img.getImage();
		img = new ImageIcon("icons/pacmanDown.jpg");
		pacmanDown = img.getImage();
		finalImg = pacmanRight;

		tileX = 13;
		tileY = 14;
	}

	public Image getPlayer() {
		return finalImg;
	}

	public void setPlayer(Image pacman) {
		this.finalImg = pacman;
	}

	public int getTileX() {
		return tileX;
	}

	public int getTileY() {
		return tileY;
	}

	/**
	 * metoda move, care modifica pozitiile in functie de directia aleasa.
	 * @param dx Cu cate patratele se modifica pacman pe linie 
	 * @param dy Cu cate patratele se modifica pacman pe coloana
	 **/
	public void move(int dx, int dy) {
			tileX += dx;
			tileY += dy;
	}

	/**
	 * seteaza imaginea potrivita pentru pacman.
	 **/
	public void up() {
		setPlayer(pacmanUp);
	}

	/**
	 * seteaza imaginea potrivita pentru pacman.
	 **/
	public void down() {
		setPlayer(pacmanDown);
	}

	/**
	 * seteaza imaginea potrivita pentru pacman.
	 **/
	public void right() {
		setPlayer(pacmanRight);
	}

	/**
	 * seteaza imaginea potrivita pentru pacman.
	 **/
	public void left() {
		setPlayer(pacmanLeft);
	}
}
