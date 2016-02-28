package rwalwynv.pushdownbutton;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



import org.junit.Before;
import org.junit.Test;

public class PushDownButtonTest {
	PushDownButton pushDownButton = new PushDownButton(true);
	String linesep=System.getProperty("line.separator");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	
	@Before
	public void setUpStreams(){
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}
	
	@Test
	public void pushDownTest(){
		pushDownButton.pushButton();
		assertEquals("Lightbulb off" +linesep+ "Button switched to OFF" +linesep, outContent.toString());
		outContent.reset();
		pushDownButton.pushButton();
		assertEquals("Lightbulb on" +linesep+"Button switched to ON" +linesep, outContent.toString());
		outContent.reset();
	}
}
