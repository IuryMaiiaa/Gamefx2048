package test.java;

import static org.junit.Assert.assertEquals;
import main.java.Game2048;

import org.junit.Test;

public class BoardTest {
	
	@Test
	public void text() {
		assertEquals("11","11");
	}
	
	@Test
	public void novoTeste() {
		Game2048 game = new Game2048();
		game.main(null);
		try {
			game.init();
			assertEquals(true,true);
		} catch (Exception e) {
			assertEquals(true,false);
			e.printStackTrace();
		}
		
		game.stop();
		
	}
}
