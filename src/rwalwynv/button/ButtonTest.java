package rwalwynv.button;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



import org.junit.Before;
import org.junit.Test;

public class ButtonTest {
	Button button = new Button(true);
	String linesep=System.getProperty("line.separator");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	
	@Before
	public void setUpStreams(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void testSwitchOn(){
		button.switchOn();
		assertEquals("Button switched to ON" +linesep,outContent.toString() );
		outContent.reset();
		assertEquals(button.getSwitch(), true);
	}
	
	@Test
	public void testSwtichOff(){
		button.switchOff();
		assertEquals( "Button switched to OFF" +linesep,outContent.toString());
		outContent.reset();
		assertEquals(button.getSwitch(), false);
	}
}