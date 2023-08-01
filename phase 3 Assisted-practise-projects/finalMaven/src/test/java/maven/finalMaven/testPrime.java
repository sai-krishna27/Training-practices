package maven.finalMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPrime {

	@Test
	public void test1() {
		PrimeNumber obj=new PrimeNumber();
		assertEquals("17 is prime",obj.checkPrime(17));
	}
	
	@Test
	public void test2() {
		PrimeNumber obj=new PrimeNumber();
		assertEquals("12 is not prime",obj.checkPrime(12));
	}

}
