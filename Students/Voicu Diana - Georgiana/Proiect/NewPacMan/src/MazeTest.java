import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MazeTest {

	Maze m = new Maze();
	@Test
	void testIfPlayerAlive() {
		assertEquals(true, m.getIfAlive());
	}
	
	@Test
	void testNrOfKeys() {
		assertEquals(5, m.getNrOfKeys());
	}
	
	@Test
	void testScore() {
		assertEquals(0, m.getScore());
		assertEquals(0, m.getHighScore());
	}
}
