package maven.finalMaven;

public class AgeValidate {
	
	public String validateAge(int age) {
		if(age>=18) {
			return "right to vote";
		}
		else {
			return "no right to vote";
		}
	}
}
