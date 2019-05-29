package clsandobjs;

public class Accountholder {
	
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	boolean eligibleForCC;
	
	public void testEligCC() {
		eligibleForCC=false;
		if (age>25 && accountBalance>=20000) {
			eligibleForCC= true;
		}
	}
}
