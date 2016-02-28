package rwalwynv.tablelamp;

import rwalwynv.button.*;

public class Lamp {
	private Button button;
	
	
	
	
	public Lamp(boolean button){
		this.button= new Button(button);
	}
	
	public void on(){
		this.button.switchOn();
	}
	
	public void off(){
		this.button.switchOff();
	}
	
	
}
