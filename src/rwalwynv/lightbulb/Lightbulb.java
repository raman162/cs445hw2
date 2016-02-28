package rwalwynv.lightbulb;

public class Lightbulb {
	private boolean bulb;
	
	
	public Lightbulb(boolean bulb){
		this.bulb=bulb;
	}
	
	public void on(){
		this.bulb=true;
		System.out.println("Lightbulb on");
	}
	
	public void off(){
		this.bulb=false;
		System.out.println("Lightbulb off");
	}
	
	public boolean getBulb(){
		return this.bulb;
	}
}
