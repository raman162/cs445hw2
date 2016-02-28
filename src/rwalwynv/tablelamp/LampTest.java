package rwalwynv.tablelamp;

import static org.junit.Assert.*;

import org.junit.Test;

public class LampTest {
	
	Lamp lamp = new Lamp("rasta");
	
	@Test
	public void testLamp(){
		assertEquals(lamp.getName(), "rasta");
	
	}

}
