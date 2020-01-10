import static org.junit.jupiter.api.Assertions.*;

import java.awt.Image;

import javax.swing.ImageIcon;

import org.junit.jupiter.api.Test;

class PlayerTest {
	
	Player p = new Player();
	
	@Test
	void testStartingTiles() {
		assertEquals(13, p.getTileX());
		assertEquals(14, p.getTileY());
	}
	
	@Test
	void testPicRight() {
		p.right();
		ImageIcon img = new ImageIcon("icons/pacmanRight.jpg");
		Image pacmanRight = img.getImage();
		assertEquals(pacmanRight, p.getPlayer());
	}
	
	@Test
	void testPicLeft() {
		p.left();
		ImageIcon img = new ImageIcon("icons/pacmanLeft.jpg");
		Image pacmanLeft = img.getImage();
		assertEquals(pacmanLeft, p.getPlayer());
	}
	
	@Test
	void testPicUp() {
		p.up();
		ImageIcon img = new ImageIcon("icons/pacmanUp.jpg");
		Image pacmanUp = img.getImage();
		assertEquals(pacmanUp, p.getPlayer());
	}
	
	@Test
	void testPicDown() {
		p.down();
		ImageIcon img = new ImageIcon("icons/pacmanDown.jpg");
		Image pacmanDown = img.getImage();
		assertEquals(pacmanDown, p.getPlayer());
	}
	
	@Test
	void moveRight () {
		p.move(2,0);
		assertEquals(15, p.getTileX());
		assertEquals(14, p.getTileY());
	}
	
	@Test
	void moveLeft () {
		p.move(-2,0);
		assertEquals(11, p.getTileX());
		assertEquals(14, p.getTileY());
	}
	
	@Test
	void moveUp () {
		p.move(0,-2);
		assertEquals(13, p.getTileX());
		assertEquals(12, p.getTileY());
	}
	
	@Test
	void moveDown () {
		p.move(0,1);
		assertEquals(13, p.getTileX());
		assertEquals(15, p.getTileY());
	}

}
