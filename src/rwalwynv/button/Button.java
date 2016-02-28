package rwalwynv.button;
import rwalwynv.lightbulb.*;
public class Button {
	private Lightbulb bulb;
	private boolean button;
	
	
	
	
	public Button(boolean button){
		this.bulb= new Lightbulb(button);
		this.button=button;
	}
	
	
	public void switchOn(){
		this.button=true;
//		bulb.on();
		System.out.println("Button switched to ON");
	}
	
	public void switchOff(){
		this.button=false;
//		bulb.off();
		System.out.println("Button switched to OFF");
	}
	
	public boolean getSwitch(){
		return this.button;
	}
	
	public boolean getBulb(){
		return this.bulb.getBulb();
	}
}
