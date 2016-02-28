package rwalwynv.lightbulb;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



import org.junit.Before;
import org.junit.Test;

public class LightbulbTest {
	Lightbulb bulb=new Lightbulb(true);
	String linesep=System.getProperty("line.separator");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	
	@Before
	public void setUpStreams(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	
	@Test
	public void testOn(){
		bulb.on();
		assertEquals("Lightbulb on" +linesep, outContent.toString());
		outContent.reset();
		assertEquals(true, bulb.getBulb());
	}
	
	@Test
	public void testOff(){
		bulb.off();
		assertEquals("Lightbulb off" +linesep, outContent.toString());
		outContent.reset();
		assertEquals(false, bulb.getBulb());
	}
}
