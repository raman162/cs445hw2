package rwalwynv.tablelamp;

import rwalwynv.pushdownbutton.*;

public class Lamp {
	private PushDownButton button;
	
	
	
	
	public Lamp(boolean button){
		this.button= new PushDownButton(button);
	}
	
	public void pushDown(){
		this.button.pushButton();
	}
	
	
}
