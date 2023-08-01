package GroupTest;

import org.testng.annotations.Test;


public class Tests {
	
	
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("in test1");
	}
	
	@Test(groups = {"smoke","functional"})
	public void test2() {
		System.out.println("in test2");
	}
	
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("in test3");
	}

	
	
}
