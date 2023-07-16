package maven.finalMaven;

public class PrimeNumber {
	
	public String checkPrime(int number) {
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return number+" is not prime";
			}
		}
		return number+" is prime";
	}
}
