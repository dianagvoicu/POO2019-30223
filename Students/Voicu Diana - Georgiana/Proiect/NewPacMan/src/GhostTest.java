

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GhostTest {

	Ghost g = new Ghost(25,25);
	
	@Test
	void testCanMoveRight() {
		assertEquals(true, g.canMove(2, 1));
	}
	
	@Test
	void testCanMoveLeft() {
		assertEquals(false, g.canMove(0, 1));
	}
	
	@Test
	void testCanMoveDown() {
		assertEquals(true, g.canMove(1, 2));
	}
	
	@Test
	void testCanMoveUp() {
		assertEquals(false, g.canMove(1, 0));
	}
	
	@Test
	void testMoveRandom() {
		g.randomChanging();
		assertEquals(0, g.getDir());
	}

}
