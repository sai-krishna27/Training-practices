package com.java2;


interface GamingConsole1 {
	void up();
	void down();
}
interface GamingConsole2
{
	void left();
	void right();
}
class Mario implements GamingConsole1,GamingConsole2{

	@Override
	public void up() {
		System.out.println("Mario Jump");
		
	}

	@Override
	public void down() {
		System.out.println("Mario crouch");
		
	}

	@Override
	public void left() {
		System.out.println("Mario left");
		
	}

	@Override
	public void right() {
		System.out.println("Mario right");
		
	}
	
}

public class DiamondProblemSolution {

	public static void main(String[] args) {
		Mario mario=new Mario();
		mario.up();
		mario.down();
		mario.left();
		mario.right();

	}

}
