package maven.finalMaven;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAge {
//@Test - test method
	@Test
	public void test1() {
		AgeValidate valid=new AgeValidate();
		
	//	 expected value  actual value
		  assertEquals("right to vote",valid.validateAge(19));
	}

	
	@Test
	public void test2() {
		AgeValidate valid=new AgeValidate();
		
	//	 expected value  actual value
		  assertEquals("no right to vote",valid.validateAge(9));
	}
}
