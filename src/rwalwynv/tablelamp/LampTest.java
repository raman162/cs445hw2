package rwalwynv.tablelamp;


import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



import org.junit.Before;
import org.junit.Test;
public class LampTest {
	
	Lamp lamp = new Lamp(true);
	String linesep=System.getProperty("line.separator");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	
	@Before
	public void setUpStreams(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));	
	}
	@Test
	public void testLampOn(){
		lamp.on();
		assertEquals("Button switched to ON" +linesep, outContent.toString());
		outContent.reset();
	}
	
	@Test
	public void testLampOff(){
		lamp.off();
		assertEquals("Button switched to OFF" +linesep, outContent.toString());
		outContent.reset();
	}

}
