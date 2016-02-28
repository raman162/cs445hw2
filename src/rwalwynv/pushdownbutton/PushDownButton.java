package rwalwynv.pushdownbutton;
import rwalwynv.lightbulb.*;
public class PushDownButton {
	private boolean button;
	private Lightbulb bulb;
	
	public PushDownButton(boolean button){
		this.button=button;
		bulb = new Lightbulb(button);
	}
	
	public void pushButton(){
		if (this.button == true){
			this.button = false;
			this.bulb.off();
			System.out.println("Button switched to OFF");
		}else{
			this.button =true;
			this.bulb.on();
			System.out.println("Button switched to ON");
		}
		
	}
}
