package game2048test;

import static org.junit.Assert.*;
import game2048.Tile;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class BoardTest {
	
	@Test
	@Category(game2048test.BoardTest.class)
	public void text() {
		Tile t1= new Tile(11);
		assertEquals("11", t1.getValue().toString());
	}
	
	@Test
	@Category(game2048test.BoardTest.class)
	public void text1() {
		Tile t1= new Tile(11);
		assertEquals("11", t1.getValue().toString());
	}

}
