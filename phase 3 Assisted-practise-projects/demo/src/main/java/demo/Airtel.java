package demo;

public class Airtel implements Sim{
	private int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void typeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("Airtel is the sim");
	}

	public void dataTypeOfSim() {
		// TODO Auto-generated method stub
		System.out.println("it has 5G access");
	}

	public void getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("speed of airtel sim is "+speed+" mbps");
		
	}

}
