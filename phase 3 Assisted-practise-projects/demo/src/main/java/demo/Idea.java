package demo;
public class Idea implements Sim{
	private int speed;

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("idea is the sim");
	}
	
	public Idea(int speed) {
		this.speed=speed;
	}
	
	/*public void setSpeed(int speed) {
		this.speed = speed;
	}*/

	public void dataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("it has 4G access");
	}
	
	public void getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("speed of idea sim is "+speed+" mbps");
		
	}

}
